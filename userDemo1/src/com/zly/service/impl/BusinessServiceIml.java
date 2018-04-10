package com.zly.service.impl;

import com.zly.dao.UserDao;
import com.zly.dao.impl.UserDaoImpl;
import com.zly.domain.User;
import com.zly.exception.UserExistException;
import com.zly.utils.ServiceUtils;

//对web层提供业务服务
public class BusinessServiceIml {
	
	private UserDao dao = new UserDaoImpl();
	
	//对web提供注册服务
	public void register(User user) throws UserExistException{
		if (dao.find(user.getUsername()) != null) {
			//抛出用户已存在异常
			throw new UserExistException();
		}else{
			user.setPassword(ServiceUtils.md5(user.getPassword()));
			dao.add(user);
		}
	}
	
	//对web提供登录服务
	public User login(String userName,String passWord) throws UserExistException{
		String password = ServiceUtils.md5(passWord);
		User user = dao.findUser(userName, password);
		if(user != null){
			return user;
		}else{
			throw new UserExistException();
		}
	}
}
