package com.naveen.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

		String sql ="update bank set location=? where bankid=?";
		try {
			PreparedStatement ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			ps.setString(1, location);
			ps.setInt(2, bankId);
			ps.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Updated records...");
		return this.getBank(bankId);
	}

	@Override
	public void deleteBank(int bankId) {

		String sql ="delete from bank where bankid=?";
		try {
			PreparedStatement ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			ps.setInt(1, bankId);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	@Override
	public Bank getBank(int bankId) {
		String sql ="select bankid , bankname , location  from bank where bankid=?"; 
		
		try {
			PreparedStatement ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			ps.setInt(1, bankId);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new Bank(bankId, rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Bank> getBanks() {

		String sql ="select bankid , bankname , location  from bank"; 
		List<Bank> list = new ArrayList<Bank>(); 
		try {
			PreparedStatement ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Bank bank = new Bank(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(bank);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list; 
	}

	
	public List<Bank> getBankByLocation(String location) {
		return null; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
