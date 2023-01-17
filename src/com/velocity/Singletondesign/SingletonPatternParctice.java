package com.velocity.Singletondesign;

public class SingletonPatternParctice {
	//step 1:create the static attributes
	private static SingletonPatternParctice singleton= new SingletonPatternParctice();//instance at class loading
	//step 2:Creat the private constructor
	private SingletonPatternParctice() {
		
	}
	//step 3: design the static method so instance can be access globaly
	public static SingletonPatternParctice getInstance() {
		System.out.println("This is the static method of globle access...!");
		return singleton;
	}
	

}
