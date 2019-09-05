package com.czy.dao;

import com.czy.bean.User;

public interface UserDao {

	// 添加用户
	public boolean addUser(User user) throws Exception;

	// 修改邮箱
	public boolean editEmail(int usid, String email)
			throws Exception;

	// 修改密码
	public boolean editPasswd(int usid, String passwd) throws Exception;

	// 修改最后登录时间
	public boolean editLoginTime(int usid) throws Exception;

	// 删除用户
	public boolean deleteUser(int usid) throws Exception;

	// 通过用户名查找用户
	public User queryByName(String uname) throws Exception;

	// 通过email查找用户
	public User queryByEmail(String email) throws Exception;

}
