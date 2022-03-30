package com.naveen.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.user.service.bean.User;
import com.naveen.user.service.service.UserService;

@CrossOrigin(origins = "*")

@RestController
public class UserController {

	@Autowired
	private UserService service; 
	
	// http://localhost:9090/hello
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello From Spring Boot"; 
	}
	
	// http://localhost:9090/users - POST 	
	@PostMapping("/users")
	public User saveUser( @RequestBody User user) {
		return service.insertUser(user); 
	}
	
	@GetMapping("/users")
	public Iterable<User> getAllUses() {
		return service.getAllUsers(); 
	}
	
	
	
}
