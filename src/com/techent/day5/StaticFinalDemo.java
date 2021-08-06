package com.techent.day5;

class Employee{
	static String dept;
	final int id=1;
	
}
public class StaticFinalDemo {

	public static void main(String[] args) {

		Employee empl = new Employee();
		Employee emp2 = new Employee();
		empl.dept="HR";
		emp2.dept="Department";
		System.out.println("Employee : "+empl.dept);
		System.out.println("Employee : "+emp2.dept);	
	}
}