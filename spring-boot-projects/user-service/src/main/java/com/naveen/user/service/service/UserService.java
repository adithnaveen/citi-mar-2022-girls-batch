package com.naveen.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.user.service.bean.User;
import com.naveen.user.service.dao.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo; 
	
	
	public User insertUser(User user) {
		return repo.save(user);
	}
	
	public Iterable<User> getAllUsers() {
		return repo.findAll(); 
	}
	
	public void deleteUser(Integer userId) {
		repo.deleteById(userId);
	}
	// all other methods are available 
}
