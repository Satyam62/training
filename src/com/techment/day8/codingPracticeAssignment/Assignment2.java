package com.techment.day8.codingPracticeAssignment;

class Employee{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName +"   lastName= " + lastName + "]";
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Satyam", "Sahu");
		Employee emp2=new Employee("Akshat", "Goyal");
		Employee emp3=new Employee("Divyanshi", "Ali");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());

	}

}
/**
Declare the Employee Class with firstName and lastName and initialize the value through 
Constructor.Print the instance of the Employee that display the firstName and lastName.create 
3 instance and print the object.
Note : use toString method

*/