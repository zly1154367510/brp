package com.zly.test;

import org.junit.Test;

import com.zly.dao.UserDao;
import com.zly.dao.impl.UserDaoImpl;
import com.zly.domain.User;
import com.zly.exception.UserExistException;
import com.zly.service.impl.BusinessServiceIml;

public class UserDaoTest {
	
	@Test
	public void testlogin(){
		BusinessServiceIml businessServiceIml = new BusinessServiceIml();
		try {
			businessServiceIml.login("bb","445");
			System.out.println("×¢²á³É¹¦");
		} catch (UserExistException e) {
			// TODO Auto-generated catch block
			System.out.println("×¢²áÊ§°Ü");
		}	
	}
	
}
