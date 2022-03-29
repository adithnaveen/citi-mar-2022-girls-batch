package com.naveen.bankdao.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.naveen.bean.Bank;
import com.naveen.contracts.IBankDAO;
import com.naveen.day1.IBank;

public class MockTest1 {

	@Test
	public void mockTest1() {
		
		List<String> list = mock(List.class); 
		
		when(list.get(0)).thenReturn("Reena");
		when(list.get(1)).thenReturn("Neha");
		
		assertEquals("Reena", list.get(0));
		assertEquals("Neha", list.get(1));
		
	}

	@Test
	public void mockTest2() {
		
		List<String> list = mock(List.class); 
		
		when(list.get(anyInt())).thenReturn("Reena");
		assertEquals("Reena", list.get(10));
		
	}
	
	
	@Test
	public void mockInsertBankDAO() {
		IBankDAO dao = mock(IBankDAO.class); 
		
		
		Bank bank = new Bank(101, "MYBANK", "BENGALURU"); 
		when(dao.getBank(101)).thenReturn(bank);
		
		
		assertEquals("MYBANK", bank.getBankName());
		
	}
	

}
