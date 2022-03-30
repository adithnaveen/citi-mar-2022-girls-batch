package com.naveen.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.naveen.dao.DummyEmployeeDAO;
import com.naveen.dao.JDBCEmployeeDAO;

// you have @Configuration called, the project gets
// scafolded and all the dependencies will be loaded 
@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("in consturctor AppConfig()");
	}
	
	// if you dont annotated with spring specific annotations 
	// then it is called as transient 
	// that object will become persistent 
	// when you annotate the method with @Bean 
	// the object is kept in the spring container 
	// and by default it is singleton 
	@Bean(name = "jdbc")
	// when you say prototype it mean you dont want spring support 
	@Scope("singleton")
	public JDBCEmployeeDAO jdbcEmployee() {
		return new JDBCEmployeeDAO(); 
	}
	
	@Bean(name="dummy")
	public DummyEmployeeDAO dummyDao() {
		return new DummyEmployeeDAO(); 
	}
	
}
