package com.test.child;
import com.deepti.firstPackage.InvalidInputException;

public class Football implements Play{

	@Override
	public void display() {
		System.out.println("I am playing football");
		 InvalidInputException y = new InvalidInputException(null);
		
	}

}
