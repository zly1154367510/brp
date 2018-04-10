package com.zly.jdbc.login;

public class User {
	
	private String usernameString;
	private String passwordString;
	private int idString;
	
	public String getUsernameString() {
		return usernameString;
	}
	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}
	public String getPasswordString() {
		return passwordString;
	}
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
	public int getIdString() {
		return idString;
	}
	public void setIdString(int i) {
		this.idString = i;
	}

}
