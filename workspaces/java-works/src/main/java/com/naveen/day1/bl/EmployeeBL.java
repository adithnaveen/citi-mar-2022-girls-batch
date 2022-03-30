package com.naveen.day1.bl;

import com.naveen.day1.bean.Employee;
import com.naveen.day1.bean.SoftwareDeveloper;
import com.naveen.day1.bean.TeamLeader;

public class EmployeeBL implements IEmployeeBL {

//	 do type checking with -> String type, 
	public static Employee setEmployeeData( int empId, String firstName, String lastName, double salary) {
//		Employee emp = new Employee();
//		emp.setEmpId(empId);
//		emp.setFirstName(firstName);
//		emp.setLastName(lastName);
//		emp.setSalary(salary);
		
		return null;
	}
	
	public static Employee setEmployeeData1(String type, Employee employee, String addResp) {
		if(type.equalsIgnoreCase("tl")) {
			return new TeamLeader(employee.getEmpId(), employee.getName(), employee.getSalary(), addResp); 
		}else if(type.equalsIgnoreCase("sd")) {
			return new SoftwareDeveloper(employee.getEmpId(), employee.getName(), employee.getSalary(), addResp); 
		}
		
		return null; 
	}
	
	
	public void display(Employee emp) {
		System.out.println("----------------------------");
		System.out.println("Emp Id:" + emp.getEmpId());
		System.out.println("Emp First Name:" + emp.getName().getFirstName());
		System.out.println("Emp Last Name: " + emp.getName().getLastName());
		System.out.println("Emp Salary: " + emp.getSalary());
		
		if(emp instanceof TeamLeader) {
			System.out.println("Approver For: "
					+((TeamLeader)emp).getApprove());
		}else if(emp instanceof SoftwareDeveloper) {
			System.out.println("Project working for " 
					+ ((SoftwareDeveloper)emp).getProject());
		}
		
	}

}
