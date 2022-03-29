package com.naveen.contracts;

import java.util.List;

import com.naveen.bean.Bank;

public interface IBankDAO {
	
	// CRUD 
	
	
	public boolean insertBank(Bank bank);
	public Bank updateBank(int bankId, String location); 
	public void deleteBank(int bankId); 
	public Bank getBank(int bankId); 
	public List<Bank> getBanks(); 
}
