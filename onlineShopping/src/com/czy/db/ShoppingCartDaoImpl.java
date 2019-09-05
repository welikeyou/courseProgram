package com.czy.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.czy.bean.Goods;
import com.czy.bean.ShoppingCart;
import com.czy.dao.AlreadyBuyDao;
import com.czy.dao.GoodsDao;
import com.czy.dao.ShoppingCartDao;
import com.czy.factory.DAOFactory;

public class ShoppingCartDaoImpl implements ShoppingCartDao {

	private Connection conn = null;

	private PreparedStatement pstmt = null;

	public ShoppingCartDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	//向购物车添加商品
	@Override
	public boolean addGoods(int usid, int gid, int number) throws Exception {
		pstmt = null;
		int result = 0;
		String message = this.getDesignateGoodsMs(usid, gid);
		if (!"".equals(message)) {
			int sid = Integer.valueOf(message.split("&")[0]);
			int goodsCount = Integer.valueOf(message.split("&")[1]);
			String sql = "update shoppingcart set snumber=?,sdate=TO_DATE('20190506', 'yyyymmdd') where sid=?";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, goodsCount + number);
			pstmt.setInt(2, sid);
		} else {
			String sql = "insert into shoppingcart(sid,usid,gid,snumber,sdate)values(1,?,?,?,TO_DATE('20190506', 'yyyymmdd'))";
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, usid);
			pstmt.setInt(2, gid);
			pstmt.setInt(3, number);
		}
		result = pstmt.executeUpdate();
		pstmt.close();
		if (result == 1) {
			return true;
		}
		return false;
	}
	
	//删除购物车中的商品
	@Override
	public boolean deleteGoods(int usid, int gid, int number) throws Exception {
		String message = this.getDesignateGoodsMs(usid, gid);
		int result = 0;
		if (!"".equals(message)) {
			int sid = Integer.valueOf(message.split("&")[0]);
			int goodsCount = Integer.valueOf(message.split("&")[1]);
			if (goodsCount < number) {
				return false;
			} else if (goodsCount == number) {
				String sql = "delete from shoppingcart where sid=?";
				pstmt = this.conn.prepareStatement(sql);
				pstmt.setInt(1, sid);
			} else {
				String sql = "update shoppingcart set snumber=? where sid=?";
				pstmt = this.conn.prepareStatement(sql);
				pstmt.setInt(1, goodsCount - number);
				pstmt.setInt(2, sid);
			}
			result = pstmt.executeUpdate();
			pstmt.close();
		}
		if (result == 1) {
			return true;
		}
		return false;
	}
	
	//获取购物车中的所有商品
	@Override
	public List<ShoppingCart> getAllGoods(int usid) throws Exception {
		pstmt = null;
		ResultSet rs = null;
		List<ShoppingCart> scList = null;
		String sql = "select * from shoppingcart where usid=?";
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setInt(1, usid);
		rs = pstmt.executeQuery();
		ShoppingCart sc;
		scList = new ArrayList<ShoppingCart>();
		while (rs.next()) {
			sc = new ShoppingCart();
			sc.setSid(rs.getInt("sid"));
			sc.setUsid(rs.getInt("usid"));
			sc.setGid(rs.getInt("gid"));
			sc.setNumber(rs.getInt("snumber"));
			String date = rs.getDate("sdate").toString();
			sc.setSdate(date);
			scList.add(sc);
		}
		return scList;
	}
	
	//检查指定用户购物车中是否含有指定商品，如果有则返回购物车id和商品数量，否则返回空
	@Override
	public String getDesignateGoodsMs(int usid, int gid) throws Exception {
		ResultSet rs = null;
		String sql = "select * from shoppingcart where usid =? and gid=?";
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setInt(1, usid);
		pstmt.setInt(2, gid);
		rs = pstmt.executeQuery();
		if (rs.next()) {
			return rs.getString("sid") + "&" + rs.getInt("snumber");
		}
		return "";
	}

	//支付指定商品
	@Override
	public boolean payGoods(int usid, int gid, int number) throws Exception {
		boolean flag = false;
		GoodsDao dao = DAOFactory.getGoodsServiceInstance();
		int extantGoods = dao.queryNumberById(gid);
		conn.setAutoCommit(false);
		if (extantGoods >= number) {
			if (this.deleteGoods(usid, gid, number)) {
				Goods goods = dao.queryById(gid);
				goods.setNumber(extantGoods - number);
				AlreadyBuyDao ab = DAOFactory.getAlreadyBuyServiceInstance();
				flag = (ab.addBuyGoods(usid, gid, number) & dao.editInfo(goods));
			}
		}
		conn.commit();
		conn.setAutoCommit(true);
		return flag;
	}

	//支付所有商品
	@Override
	public boolean payAllGoods(int usid) throws Exception {
		List<ShoppingCart> scList = this.getAllGoods(usid);

		if (scList != null & scList.size() > 0) {
			int gid;
			int number;
			ShoppingCart sc;
			for (int i = 0; i < scList.size(); i++) {

				sc = scList.get(i);
				gid = sc.getGid();
				number = sc.getNumber();
				this.payGoods(usid, gid, number);
			}
			return true;
		}
		return false;
	}
}
