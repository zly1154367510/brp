package com.zly.web.formbean;

import java.util.HashMap;
import java.util.Map;

public class RegisterFormBean {
	
	private String username;
	private String password;
	private String email;
	private String birhday;
	private String cickname;
	//存储注册错误信息map
	private Map errors = new HashMap<String, String>();
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirhday() {
		return birhday;
	}
	public void setBirhday(String birhday) {
		this.birhday = birhday;
	}
	public String getCickname() {
		return cickname;
	}
	public void setCickname(String cickname) {
		this.cickname = cickname;
	}
	/*
	 * 
	 * register 
	 * 注册表单校验方法
	 * 1.用户名不为空，3-8为数字
	 * 2.密码不为空，再次输入密码和第一次一样
	 * 3.电子邮箱不为空
	 * 4.生日日期格式 yyyy-MM-dd
	 * 5.昵称不为空
	 */
	public boolean checkFromElement(){
		boolean isOK = true;
		if(this.username==null || this.username.trim().equals("")){
			isOK = false;
			errors.put("usernameError", "用户名为空");
		}
//		else if(!this.username.matches("[A-Za-z0-9]")){
//			isOK = false;
//			errors.put("usernameError", "用户名格式数字错误");
//		}
		if(this.password==null||this.password.trim().equals("")){
			isOK = false;
			errors.put("passowrd", "密码为空");
		}
//		}else if(!this.password.matches("[A-Za-z0-9]")){
//			isOK = false;
//			errors.put("passwordError", "密码格式数字错误");
//		}
		
		if(this.email==null||this.email.trim().equals("")){
			isOK = false;
			errors.put("emailError", "邮箱为空");
		}
		
		if(this.cickname==null||this.cickname.trim().equals("")){
			isOK = false;
			errors.put("cicknameError", "昵称为空");
		}
		return isOK;
		
	}
	public Map getErrors() {
		return errors;
	}
	public void setErrors(Map errors) {
		this.errors = errors;
	}
}
