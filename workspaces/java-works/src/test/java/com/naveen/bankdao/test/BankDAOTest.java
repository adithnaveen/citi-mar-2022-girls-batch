package com.naveen.bankdao.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.naveen.bean.Bank;
import com.naveen.contracts.IBankDAO;
import com.naveen.dao.BankDAO;

public class BankDAOTest {

	private IBankDAO dao; 
	
	@Before
	public void setUp() {
		dao = new BankDAO(); 
	}
	
	
	@Test
	public void testToCheckBankExistsInTheDB() {
		
		String expectedCity="Mumbai"; 
		String expectedBank ="CITI"; 
		
		Bank bank = dao.getBank(102);
		assertNotNull(bank);
		assertEquals(expectedCity, bank.getLocation());
		assertEquals(expectedBank, bank.getBankName());
		
	}

}
