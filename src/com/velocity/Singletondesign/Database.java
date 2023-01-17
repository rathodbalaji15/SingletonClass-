package com.velocity.Singletondesign;

import javax.xml.crypto.Data;

public class Database {
	private static  Database dbObj;
	private  Database() {
		
	}
	public static Database getInstance() {
		
		//create object if it is not already created
		if(dbObj==null) {
			dbObj= new Database();}
		return dbObj;
		}
		public void getConnection() {
			System.out.println("You are now connected to the Database");
			
			
		}
	
		
	}


