package com.naveen.day1.impl;

import com.naveen.day1.bean.Employee;
import com.naveen.day1.bean.Name;
import com.naveen.day1.bean.SoftwareDeveloper;
import com.naveen.day1.bean.TeamLeader;
import com.naveen.day1.bl.EmployeeBL;

public class EmployeeApp1 {
	public static void main(String[] args) {
		
		Employee [] emps = new Employee[4]; 
		
		
		emps[0] = new TeamLeader(101, new Name("Gargi", "Joshi") , 1234, "Attendance");
		
		emps[1] = new SoftwareDeveloper(102, new Name("Akshada", "Malpure") , 3234, "Credit Card"); 
		
		emps[2] = new TeamLeader(103, new Name("Meghana", "Mohanty") , 1734, "Leaves");
		
		emps[3] = EmployeeBL.setEmployeeData1("sd", 
				new Employee(104, new Name("Samruddhi", "Raut") , 3334), 
				"BankingProject");
				
				
		for(Employee temp : emps) {
			new EmployeeBL().display(temp);
		}
		
		
	}
}
