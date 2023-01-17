package com.velocity.Singletondesign;

public class Person {
	//Step 1:create the private class type attributes
	private static Person p1;
	//step2;create private constructor
	private Person() {
		
	}
	//step3:create the public static method
	public static Person getInstance() {
		if(p1==null) {
			p1= new Person();
			
		}
		return p1;
	}	
public void getConnection() {
	System.out.println("you are now connected to the Data base...");
}
}
