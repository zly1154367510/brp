package com.zly.jdbc.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginDao {
	

	User loginVerification(String username,String password) {
		User user = new User();
		Connection connection = JDBCTool.getConnection("cc");
		String sqlString = "select ID,username,password from db_javaee_user where username=? and password =?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				user.setIdString(resultSet.getInt(1));
				user.setUsernameString(resultSet.getString(2));
				user.setPasswordString(resultSet.getString(3));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
