package com.naveen.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.naveen.controller", "com.naveen.dao"})
public class AppConfig implements WebApplicationInitializer, WebMvcConfigurer {

	
	
	// use this if you want to use external css 
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context ; 
		
		context = new AnnotationConfigWebApplicationContext(); 
		context.register(AppConfig.class);
		Dynamic servlet = servletContext.addServlet("ds", 
				new DispatcherServlet(context)); 
		
		// when you put / it means all the requests 
		servlet.addMapping("/"); 
		servlet.setLoadOnStartup(1);
	}

	
	// hello -> /WEB-INF/pages/hello.jsp
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver(); 
		irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp"); 
		return irvr; 
	}
}

