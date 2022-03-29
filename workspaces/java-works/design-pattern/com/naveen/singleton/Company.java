package com.naveen.singleton;

public class Company {
	
	private Company() {
		System.out.println("Company is created..");
	}

	public static Company getCompany(Company company) {
		if(company == null) {
			return new Company(); 
		}
		
		return company;
	}
	
	
	
}
