package com.naveen.day1.impl;

import com.naveen.day1.bean.Employee;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setFirstName("Gargi");
		emp.setLastName("Joshi");
		emp.setSalary(1234);
		
		System.out.println("Emp Id:" +emp.getEmpId());
		System.out.println("Emp First Name:"
				+emp.getFirstName());
		System.out.println("Emp Last Name: " + 
				emp.getLastName());
		System.out.println("Emp Salary: " + 
				emp.getSalary());
	}
}
