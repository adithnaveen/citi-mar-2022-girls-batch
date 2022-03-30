package com.naveen.day1.bean;

public class SoftwareDeveloper extends Employee {

	private String project; 
	
	
	public SoftwareDeveloper() {
		// TODO Auto-generated constructor stub
	}


	public SoftwareDeveloper(int empId, Name name, double salary, String project) {
		super(empId, name, salary);
		this.project = project;
	}


	public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}
	
	
	
}
