package com.zly.test.jsp;

public class Person {
	
	private String name;
	private String height;
	private address address;
	
	public Person(){
		super();
	}
	
	public Person(String name, String height,address address) {
		super();
		this.name = name;
		this.height = height;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
}
