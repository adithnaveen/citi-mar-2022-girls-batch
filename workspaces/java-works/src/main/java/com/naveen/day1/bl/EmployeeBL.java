package com.naveen.day1.bl;

import com.naveen.day1.bean.Employee;
import com.naveen.day1.bean.TeamLeader;

public class EmployeeBL {

//	 do type checking with -> String type, 
	public static Employee setEmployeeData( int empId, String firstName, String lastName, double salary) {
//		Employee emp = new Employee();
//		emp.setEmpId(empId);
//		emp.setFirstName(firstName);
//		emp.setLastName(lastName);
//		emp.setSalary(salary);
		
		return null;
	}
	public static void display(Employee emp) {
		System.out.println("----------------------------");
		System.out.println("Emp Id:" + emp.getEmpId());
		System.out.println("Emp First Name:" + emp.getFirstName());
		System.out.println("Emp Last Name: " + emp.getLastName());
		System.out.println("Emp Salary: " + emp.getSalary());
		
		if(emp instanceof TeamLeader) {
			System.out.println("Approver For: "
					+((TeamLeader)emp).getApprove());
		}
		
	}

}
