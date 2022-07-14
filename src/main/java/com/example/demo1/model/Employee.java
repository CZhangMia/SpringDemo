package com.example.demo1.model;

public class Employee {
	private String USER_NAME = "";
	private String PWD = "";
	private String STATUS = "";
	private String NAME = "";
	private int ACCESS_LEVEL = 0;
	private String EMAIL = "";
	private String TEAM = "";
	
	public Employee(String A, String pwd, String status, String name, int al, String email, String team)
	{
		this.USER_NAME = A;
		this.NAME = name;
		this.PWD = pwd;
		this.STATUS = status;
		this.ACCESS_LEVEL = al;
		this.EMAIL = email;
		this.TEAM = team;
	}
	
	public String getUserName() {
		return this.USER_NAME;
	}
	
	public String getName() {
		return this.NAME;
	}

	public String getPWD() {
		return PWD;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public int getACCESS_LEVEL() {
		return ACCESS_LEVEL;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public String getTEAM() {
		return TEAM;
	}
	
	
	
}
