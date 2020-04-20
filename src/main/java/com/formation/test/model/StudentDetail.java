package com.formation.test.model;

public class StudentDetail {

	private int rollNumber;
	private String name;
	private String departName;
	private Integer age;
	private String email;
	
	public StudentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDetail(int rollNumber, String name, String departName, Integer age, String email) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.departName = departName;
		this.age = age;
		this.email = email;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
