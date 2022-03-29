package com.naveen.day1.bean;

public class Employee {
	// for private variables 
	private int empId;
	private String firstName; 
	private String lastName;
	private double salary;
	
	// public methods- you can check 
	public void setEmpId(int empId) {
		// if you want to write the conditions
		// you can do so 
		
		if(empId < 100) {
			System.out.println("Sorry Invalid Emp id");
			this.empId = 100; 
		}else
			this.empId = empId;
	}
	
	public int getEmpId() {
		return this.empId; 
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
