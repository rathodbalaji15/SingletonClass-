package com.velocity.Singletondesign;

public class SingletonMain {

	public static void main(String[] args) {
		//call the SingletonPattern
		SingletonPatternParctice instance = SingletonPatternParctice.getInstance();
		SingletonPatternParctice instance2 = SingletonPatternParctice.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		

	}

}
