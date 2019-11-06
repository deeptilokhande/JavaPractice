package com.test.parent;

import com.test.main.Main;

public class ParentClass {
	
	public static String name;
	
	private String age = "23";
	
	protected String company;
	
	
	public void display() {
		System.out.println("I am in ParentClass");
		ParentClass p = new ParentClass();
		p.name ="fa";
		System.out.println("name "+ p.name);
		
	}
	
	
 
}


