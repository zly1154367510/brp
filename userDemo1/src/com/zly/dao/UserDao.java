package com.zly.dao;

import com.zly.domain.User;

public interface UserDao {

	//���һ���û�����
	boolean add(User user);

	User findUser(String userName, String passWord);

	User find(String userName);

}