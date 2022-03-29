package com.naveen.app;

import java.util.List;

import com.naveen.bean.Bank;
import com.naveen.contracts.IBankDAO;
import com.naveen.dao.BankDAO;

public class BankApp {
	public static void main(String[] args) {
		IBankDAO dao = new BankDAO(); 
		
		Bank bank = new Bank(); 
		bank.setBankId(202);
		bank.setBankName("SC");
		bank.setLocation("Kolkatta");
		
//		System.out.println(dao.insertBank(bank) ?"Inserted" :"Not Inserted");
		
		
//		dao.updateBank(201, "Chennai TN");
		
		
//		dao.deleteBank(202);
		
		
//		Bank bank2 = dao.getBank(101);
//		System.out.println("Bank Id " + bank2.getBankId());
//		System.out.println("Bank Name " + bank2.getBankName());
//		System.out.println("Bank Location " + bank2.getLocation());
		
		
		List<Bank> banks = dao.getBanks();
		
		
		for(Bank b: banks) {
			System.out.println("----------------------------");
			System.out.println("Bank Id " + b.getBankId());
			System.out.println("Bank Name " + b.getBankName());
			System.out.println("Bank Location " + b.getLocation());
			
		}
	

		
	}
}
