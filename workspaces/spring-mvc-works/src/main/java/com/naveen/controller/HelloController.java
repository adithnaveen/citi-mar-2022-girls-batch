package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// http://localhost:8080/spring-mvc-works/hello-mvc
	
	@RequestMapping("/hello-mvc")
	public String hello() {
		System.out.println("Hello Controller called...");
		return "hello";
	}
}