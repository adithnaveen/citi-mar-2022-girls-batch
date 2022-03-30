package com.naveen.day1.impl;

import com.naveen.day1.bean.Employee;
import com.naveen.day1.bean.TeamLeader;
import com.naveen.day1.bl.EmployeeBL;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee gargi = EmployeeBL.setEmployeeData(101, "Gargi", "Joshi", 1234);

//		EmployeeBL.display(gargi);

		Employee teja = EmployeeBL.setEmployeeData(102, "Tejashree", "Patil", 2233);
//		EmployeeBL.display(teja);
		
		
//		TeamLeader tlMansi = new TeamLeader(110, "Mansi", "Indore", 3344, "attendance"); 
//		EmployeeBL.display(tlMansi);

		
	}
}
