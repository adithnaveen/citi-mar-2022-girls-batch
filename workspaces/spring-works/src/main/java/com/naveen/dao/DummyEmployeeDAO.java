package com.naveen.dao;

public class DummyEmployeeDAO implements IEmployeeDAO {

	public DummyEmployeeDAO() {
		System.out.println("DummyEmployeeDAO() constructor");
	}
	
	@Override
	public int getNoEmployees() {
		return 0; 
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