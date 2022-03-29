package com.naveen.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.naveen.bean.Bank;
import com.naveen.connection.GetConnection;
import com.naveen.contracts.IBankDAO;

// this will be the class which shall talk to db 
public class BankDAO implements IBankDAO {

	@Override
	public boolean insertBank(Bank bank) {
		String sql ="insert into bank values (?,?,?)"; 
		
		try {
			PreparedStatement ps =
					GetConnection.getMysqlConnection().prepareStatement(sql); 
			ps.setInt(1, bank.getBankId());
			ps.setString(2, bank.getBankName());
			ps.setString(3, bank.getLocation());
			
			return ps.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return false; 
	}

	@Override
	public Bank updateBank(int bankId, String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBank(int bankId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bank getBank(int bankId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bank> getBanks() {
		// TODO Auto-generated method stub
		return null;
	}

}
