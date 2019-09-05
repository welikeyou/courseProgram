package com.czy.service;

import com.czy.bean.User;
import com.czy.dao.UserDao;
import com.czy.db.DBConnection;
import com.czy.db.UserDaoImpl;

public class UserService implements UserDao {

	private DBConnection dbconn = null;

	private UserDao dao = null;

	public UserService() throws Exception {
		this.dbconn = new DBConnection();
		this.dao = new UserDaoImpl(this.dbconn.getConnection());
	}

	@Override
	public boolean addUser(User user) throws Exception {
		boolean flag = false;
		if (user != null && this.dao.queryByName(user.getUname()) == null
				&& this.dao.queryByEmail(user.getEmail()) == null) {
			flag = this.dao.addUser(user);
		}
		return flag;
	}

	@Override
	public boolean editEmail(int usid, String email) throws Exception {
		if (isInt(usid) && email != null) {
			return this.dao.editEmail(usid, email);
		}
		return false;
	}

	@Override
	public boolean editLoginTime(int usid) throws Exception {
		if (isInt(usid)) {
			return this.dao.editLoginTime(usid);
		}
		return false;
	}

	@Override
	public boolean editPasswd(int usid, String passwd) throws Exception {
		if (isInt(usid) && passwd != null) {
			return this.dao.editPasswd(usid, passwd);
		}
		return false;
	}

	@Override
	public boolean deleteUser(int usid) throws Exception {
		if (isInt(usid)) {
			return this.dao.deleteUser(usid);
		}
		return false;
	}

	@Override
	public User queryByName(String uname) throws Exception {
		if (uname != null) {
			return this.dao.queryByName(uname);
		}
		return null;
	}

	@Override
	public User queryByEmail(String email) throws Exception {
		if (email != null) {
			return this.dao.queryByEmail(email);
		}
		return null;
	}

	public boolean isInt(int index) {
		if (index == 0) {
			return false;
		}
		String str = String.valueOf(index);
		return str.matches("[0-9]+$");
	}

}
