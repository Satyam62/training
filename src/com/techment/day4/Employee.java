package com.techment.day4;

public class Employee extends Person {
	int c;
	
	public Employee() {
		super();
		c=20;
		System.out.println("default Employee a : "+a);
		System.out.println("default Employee c : "+c);
		
	}

	void showc() {
		c=20;
		System.out.println("a : "+a);
		System.out.println("c : "+c);
	}

}
