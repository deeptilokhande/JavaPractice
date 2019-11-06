package com.test.main;

import com.test.child.Cricket;
import com.test.child.Football;
import com.test.child.Play;

public class Main {
	
	private String name;

	public static void main(String[] args) {		
		
		 String[] names = {"Prashant","Deepti"};
	
		 Main.runDisplay(new Football());
		 
	}
	
	public static void runDisplay(Play p) {
		p.display();
	}
	
}
