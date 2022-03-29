package com.naveen.singleton;

public class App {
	public static void main(String[] args) {
		Company company = null; 
		
		company = Company.getCompany(company); 
		company = Company.getCompany(company); 
		company = Company.getCompany(company); 
		company = Company.getCompany(company); 
	}
}
