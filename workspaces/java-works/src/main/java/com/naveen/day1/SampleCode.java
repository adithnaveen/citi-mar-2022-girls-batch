package com.naveen.day1;

import java.util.ArrayList;
import java.util.List;

import com.naveen.day1.bean.Employee;

public class SampleCode {
	public String sayHi(String name) {
		return "Hello " + name;
	}
	
	public int add(int num1, int  num2) {
		return num1 + num2; 
	}
	
	public void sample() {
		List<String> list = new ArrayList<String>(); 
		list.add("Akshada"); 
		list.add("Neha"); 
		
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		new SampleCode().sample(); 
	}
	
	
}

