package com.naveen.app;

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
		
		System.out.println(dao.insertBank(bank) ?"Inserted" :"Not Inserted"); 
	}
}
