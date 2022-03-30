package com.naveen.dao;

public class JDBCEmployeeDAO implements IEmployeeDAO{

	public JDBCEmployeeDAO() {
		System.out.println("JDBCEmployeeDAO() invoked..");
	}
	
	@Override
	public int getNoEmployees() {
		// this is the place where you can connect with DB 
		return 100; 
	}

	@Override
	public boolean insert() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}