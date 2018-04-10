package com.zly.service.impl;

import com.zly.dao.UserDao;
import com.zly.dao.impl.UserDaoImpl;
import com.zly.domain.User;
import com.zly.exception.UserExistException;
import com.zly.utils.ServiceUtils;

//��web���ṩҵ�����
public class BusinessServiceIml {
	
	private UserDao dao = new UserDaoImpl();
	
	//��web�ṩע�����
	public void register(User user) throws UserExistException{
		if (dao.find(user.getUsername()) != null) {
			//�׳��û��Ѵ����쳣
			throw new UserExistException();
		}else{
			user.setPassword(ServiceUtils.md5(user.getPassword()));
			dao.add(user);
		}
	}
	
	//��web�ṩ��¼����
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
