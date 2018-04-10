package com.zly.web.formbean;

import java.util.HashMap;
import java.util.Map;

public class RegisterFormBean {
	
	private String username;
	private String password;
	private String email;
	private String birhday;
	private String cickname;
	//�洢ע�������Ϣmap
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
	 * ע���У�鷽��
	 * 1.�û�����Ϊ�գ�3-8Ϊ����
	 * 2.���벻Ϊ�գ��ٴ���������͵�һ��һ��
	 * 3.�������䲻Ϊ��
	 * 4.�������ڸ�ʽ yyyy-MM-dd
	 * 5.�ǳƲ�Ϊ��
	 */
	public boolean checkFromElement(){
		boolean isOK = true;
		if(this.username==null || this.username.trim().equals("")){
			isOK = false;
			errors.put("usernameError", "�û���Ϊ��");
		}
//		else if(!this.username.matches("[A-Za-z0-9]")){
//			isOK = false;
//			errors.put("usernameError", "�û�����ʽ���ִ���");
//		}
		if(this.password==null||this.password.trim().equals("")){
			isOK = false;
			errors.put("passowrd", "����Ϊ��");
		}
//		}else if(!this.password.matches("[A-Za-z0-9]")){
//			isOK = false;
//			errors.put("passwordError", "�����ʽ���ִ���");
//		}
		
		if(this.email==null||this.email.trim().equals("")){
			isOK = false;
			errors.put("emailError", "����Ϊ��");
		}
		
		if(this.cickname==null||this.cickname.trim().equals("")){
			isOK = false;
			errors.put("cicknameError", "�ǳ�Ϊ��");
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
