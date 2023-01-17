package com.velocity.Singletondesign;

public class Main1 {

	public static void main(String[] args) {
		Person p;
		//refers to the only object of Database
		p=Person.getInstance();
		p.getConnection();

	}

}
