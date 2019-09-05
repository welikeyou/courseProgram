package com.czy.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.czy.bean.AlreadyBuy;
import com.czy.dao.AlreadyBuyDao;

public class AlreadyBuyDaoImpl implements AlreadyBuyDao {

	private Connection conn = null;

	private PreparedStatement pstmt = null;

	public AlreadyBuyDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean addBuyGoods(int usid, int gid, int number) throws Exception {
		pstmt = null;
		String sql = "insert into alreadybuy(aid,usid,gid,anumber,buytime)values(1,?,?,?,20190506)";
		int result = 0;
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setInt(1, usid);
		pstmt.setInt(2, gid);
		pstmt.setInt(3, number);
		result = pstmt.executeUpdate();
		pstmt.close();
		if (result == 1) {
			return true;
		}
		return false;
	}

	@Override
	public List<AlreadyBuy> getAllBuyGoods(int usid) throws Exception {
		pstmt = null;
		ResultSet rs = null;
		List<AlreadyBuy> abList = null;
		String sql = "select * from alreadyBuy where usid=? order by buytime desc";
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setInt(1, usid);
		rs = pstmt.executeQuery();
		AlreadyBuy ab;
		abList = new ArrayList<AlreadyBuy>();
		while (rs.next()) {
			ab = new AlreadyBuy();
			ab.setUsid(usid);
			ab.setAid(rs.getInt("aid"));
			ab.setGid(rs.getInt("gid"));
			ab.setNumber(rs.getInt("anumber"));
			String date = rs.getString("buytime");
			ab.setBuyTime(date);
			abList.add(ab);
		}
		return abList;
	}

}
