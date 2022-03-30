package com.naveen.day1.bean;

public class TeamLeader  extends Employee{
	private String approve;

	public TeamLeader(
			int empId, Name name, double salary, 
			String approve
			) {
		super(empId, name, salary); 
		this.approve = approve;
	}
	
	
	public String getApprove() {
		return approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	} 
	
	
}
