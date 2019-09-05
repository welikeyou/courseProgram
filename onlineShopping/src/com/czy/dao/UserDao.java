package com.czy.dao;

import com.czy.bean.User;

public interface UserDao {

	// ����û�
	public boolean addUser(User user) throws Exception;

	// �޸�����
	public boolean editEmail(int usid, String email)
			throws Exception;

	// �޸�����
	public boolean editPasswd(int usid, String passwd) throws Exception;

	// �޸�����¼ʱ��
	public boolean editLoginTime(int usid) throws Exception;

	// ɾ���û�
	public boolean deleteUser(int usid) throws Exception;

	// ͨ���û��������û�
	public User queryByName(String uname) throws Exception;

	// ͨ��email�����û�
	public User queryByEmail(String email) throws Exception;

}
