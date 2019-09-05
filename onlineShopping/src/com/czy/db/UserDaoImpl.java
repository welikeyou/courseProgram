package com.czy.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.czy.bean.User;
import com.czy.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private Connection conn = null;

	private PreparedStatement pstmt = null;

	public UserDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean addUser(User user) throws Exception {
		pstmt = null;
		String sql = "insert into users(usid,uname,passwd,email,lastLogin)values(1,?,?,?,?)";
		int result = 0;
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setString(1, user.getUname());
		pstmt.setString(2, user.getPasswd());
		pstmt.setString(3, user.getEmail());
		pstmt.setString(4, user.getPasswd());
		result = pstmt.executeUpdate();
		pstmt.close();
		if (result == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean editEmail(int usid, String email) throws Exception {
		User user = queryByEmail(email);
		if (user != null && user.getUsid() != usid) {
			return false;
		}
		pstmt = null;
		String sql = "update users set email=? where usid=?";
		int result = 0;
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setInt(2, usid);
		result = pstmt.executeUpdate();
		pstmt.close();
		if (result == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean editLoginTime(int usid) throws Exception {
		pstmt = null;
		String sql = "update users set lastLogin=sysdate() where usid=?";
		int result = 0;
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setInt(1, usid);
		result = pstmt.executeUpdate();
		pstmt.close();
		if (result == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean editPasswd(int usid, String passwd) throws Exception {
		String sql = "update users set passwd=? where usid=" + usid;
		int result = 0;
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setString(1, passwd);
		result = pstmt.executeUpdate();
		pstmt.close();
		if (result == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(int usid) throws Exception {
		String sql = "delete from Users where usid=?";
		int result = 0;
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setInt(1, usid);
		result = pstmt.executeUpdate();
		pstmt.close();
		if (result == 1) {
			return true;
		}
		return false;
	}

	@Override
	public User queryByName(String uname) throws Exception {
		User user = null;
		ResultSet rs = null;
		String sql = "select * from users where uname =?";
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setString(1, uname);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			user = new User();
			int usid = rs.getInt("usid");
			String passwd = rs.getString("passwd");
			String email = rs.getString("email");
			user.setUsid(usid);
			user.setUname(uname);
			user.setPasswd(passwd);
			user.setEmail(email);
		}
		pstmt.close();
		rs.close();
		return user;
	}

	@Override
	public User queryByEmail(String email) throws Exception {
		User user = null;
		ResultSet rs = null;
		String sql = "select * from users where email=?";
		pstmt = this.conn.prepareStatement(sql);
		pstmt.setString(1, email);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			user = new User();
			int usid = rs.getInt("usid");
			String uname = rs.getString("uname");
			String passwd = rs.getString("passwd");
			user.setUsid(usid);
			user.setUname(uname);
			user.setPasswd(passwd);
			user.setEmail(email);
			String date = rs.getString("lastlogin");
			user.setLastLogin(date);
		}
		pstmt.close();
		rs.close();
		return user;
	}

}
