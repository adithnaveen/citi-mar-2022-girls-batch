package com.naveen.day1;

class One{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized calledd. ");
	}

} 
public class HelloWorld {
	public static void main(String[] args) {
		new One(); 
		
		System.runFinalizersOnExit(true);
		
	}
	
	
}
