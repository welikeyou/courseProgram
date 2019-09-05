package com.czy.service;

import java.sql.SQLException;
import java.util.List;

import com.czy.bean.ShoppingCart;
import com.czy.dao.ShoppingCartDao;
import com.czy.db.DBConnection;
import com.czy.db.ShoppingCartDaoImpl;

public class ShoppingCartService implements ShoppingCartDao {

	private DBConnection dbconn = null;

	private ShoppingCartDao dao = null;

	public ShoppingCartService() throws SQLException {
		this.dbconn = new DBConnection();
		this.dao = new ShoppingCartDaoImpl(this.dbconn.getConnection());
	}

	@Override
	public boolean addGoods(int usid, int gid, int number) throws Exception {
		if (isInt(usid) && isInt(gid) && isInt(number)) {
			return this.dao.addGoods(usid, gid, number);
		}
		return false;
	}

	@Override
	public boolean deleteGoods(int usid, int gid, int number) throws Exception {
		if (isInt(usid) && isInt(gid) && isInt(number)) {
			return this.dao.deleteGoods(usid, gid, number);
		}
		return false;
	}

	@Override
	public List<ShoppingCart> getAllGoods(int usid) throws Exception {
		if (isInt(usid)) {
			return this.dao.getAllGoods(usid);
		}
		return null;
	}

	@Override
	public String getDesignateGoodsMs(int usid, int gid) throws Exception {
		if (isInt(usid) && isInt(gid)) {
			return this.dao.getDesignateGoodsMs(usid, gid);
		}
		return "";
	}

	@Override
	public boolean payGoods(int usid, int gid, int number) throws Exception {
		if (isInt(usid) && isInt(gid) && isInt(number)) {
			return this.dao.payGoods(usid, gid, number);
		}
		return false;
	}

	@Override
	public boolean payAllGoods(int usid) throws Exception {
		if (isInt(usid)) {
			return this.dao.payAllGoods(usid);
		}
		return false;
	}

	public boolean isInt(int index) {
		if (index == 0) {
			return false;
		}
		String str = String.valueOf(index);
		return str.matches("[0-9]+$");
	}

}
