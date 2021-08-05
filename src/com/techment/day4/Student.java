package com.techment.day4;

public class Student extends Person {
	int b;
	
	public Student() {
		super();
		b=10;
		System.out.println("default Student a : "+a);
		System.out.println("default Student b : "+b);
	}

	void showb() {
		b=10;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
