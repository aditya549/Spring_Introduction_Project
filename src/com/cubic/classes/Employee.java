package com.cubic.classes;

public class Employee {
	private int eid;
	private String name;
	private String password;
	
	public Employee() {
		System.out.println("Empployee Constructor");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void display() {
		System.out.println("Display Method");
	}
	
}
