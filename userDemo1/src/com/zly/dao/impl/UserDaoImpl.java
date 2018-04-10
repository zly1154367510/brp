package com.zly.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.jws.soap.SOAPBinding.Use;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import sun.print.resources.serviceui;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;
import com.zly.dao.UserDao;
import com.zly.domain.User;
import com.zly.utils.DbConntent;
import com.zly.utils.XmlUtils;

public class UserDaoImpl implements UserDao {
	
	private static Connection connection = null;
	static{
		connection = DbConntent.getConnection("cc");
	}
	//添加一个用户对象
	/* (non-Javadoc)
	 * @see com.zly.dao.impl.UserDao#add(com.zly.domain.User)
	 */
	public boolean add(User user){
		String sql = "INSERT INTO user(id, username, password, email, birhday, cick_name) VALUES (null,?,?,?,?,?)";
		PreparedStatement p = null;
		try {
			p = connection.prepareStatement(sql);
			p.setString(1, user.getUsername());
			p.setString(2, user.getPassword());
			p.setString(3, user.getEmail());
			p.setString(4, user.getBirhday());
			p.setString(5, user.getCickname());
			System.out.println(p);
			int resultSet = p.executeUpdate();
			if (resultSet != 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		}finally{
			try {
				p.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		
	}
	
	/* (non-Javadoc)
	 * @see com.zly.dao.impl.UserDao#findUser(java.lang.String, java.lang.String)
	 */
	public User findUser (String userName,String passWord){
		String sql = "select * from user where username=? and password=?";
		PreparedStatement p = null;
		try {
			p = connection.prepareStatement(sql);
			p.setString(1, userName);
			p.setString(2, passWord);
			System.out.println(p);
			ResultSet resultSet = p.executeQuery();
			if (resultSet.next()) {
				User user = new User();
				user.setUsername(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				user.setBirhday(resultSet.getString(5));
				user.setCickname(resultSet.getString(6));
				return user;
			}else{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	
	}
	
	/* (non-Javadoc)
	 * @see com.zly.dao.impl.UserDao#find(java.lang.String)
	 */
	public User find(String userName){
		
		String sql = "select * from user where username=?";
		PreparedStatement p = null;
		try {
			p = connection.prepareStatement(sql);
			p.setString(1, userName);
			ResultSet resultSet = p.executeQuery();
			if (resultSet.next()) {
				User user = new User();
				user.setUsername(resultSet.getString(2));
				user.setPassword(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				user.setBirhday(resultSet.getString(5));
				user.setCickname(resultSet.getString(6));
				return user;
			}else{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
