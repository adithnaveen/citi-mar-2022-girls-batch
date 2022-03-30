package com.naveen.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.cfg.AppConfig;
import com.naveen.dao.DummyEmployeeDAO;
import com.naveen.dao.IEmployeeDAO;
import com.naveen.dao.JDBCEmployeeDAO;

public class App {
	public static void main(String[] args) {
		// this line will load the configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IEmployeeDAO dao;

		dao = context.getBean("dummy", DummyEmployeeDAO.class);
		System.out.println(dao.getNoEmployees());

		dao = context.getBean("jdbc", JDBCEmployeeDAO.class);
		System.out.println(dao.getNoEmployees());

		dao = context.getBean("jdbc", JDBCEmployeeDAO.class);
		System.out.println(dao.getNoEmployees());

		dao = context.getBean("jdbc", JDBCEmployeeDAO.class);
		System.out.println(dao.getNoEmployees());

	}
}
