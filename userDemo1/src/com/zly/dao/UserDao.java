package com.zly.dao;

import com.zly.domain.User;

public interface UserDao {

	//添加一个用户对象
	boolean add(User user);

	User findUser(String userName, String passWord);

	User find(String userName);

}