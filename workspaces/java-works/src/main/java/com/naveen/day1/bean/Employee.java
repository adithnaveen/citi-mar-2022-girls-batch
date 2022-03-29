package com.naveen.day1.bean;

public abstract class Employee {
	// for private variables 
	private int empId;
	private String firstName; 
	private String lastName;
	private double salary;

	// even if you dont write this will be created 
	// by compiler at compile time 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Employee(int empId, String firstName, String lastName, double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}





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
