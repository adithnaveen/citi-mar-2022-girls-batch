package com.naveen.day1.bean;

public class TeamLeader  extends Employee{
	private String approve;

	public TeamLeader(
			int empId, String firstName, 
			String lastName, double salary, 
			String approve
			) {
		super(empId, firstName, lastName, salary); 
		this.approve = approve;
	}
	
	
	public String getApprove() {
		return approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	} 
	
	
}
