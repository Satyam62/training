package com.techment.day5.oops;

class Employee

{
	int id;
	String name;
	Address address;   // object reference  //object reference(has-a relation)
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void displayEmpoyeeInfo()
	{
		System.out.println("id:"+ id);
		System.out.println("name:"+ name);
		System.out.println("doorNo:"+ address.doorNo);
		System.out.println("city:"+ address.city);
		System.out.println("pincode:"+ address.pincode);
		System.out.println("city:"+ address.streetName);
		
	}
	
}


class Address
{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	 
}
public class HasARelationship {

	public static void main(String[] args) {

		Address address = new Address(101,"xyz", "raipur",45683);
		Employee employee = new Employee(1,"Satyam",address);
		employee.displayEmpoyeeInfo();
	}
}
//class Employee{
//	int id;
//	String name;
//	Address address; //object reference
//	public Employee(int id, String name, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}
//	void displayEmpoyeeInfo()
//	{
//		System.out.println("id:"+ id);
//		System.out.println("name:"+ name);
//		System.out.println("doorNo:"+ address.doorNo);
//		System.out.println("city:"+ address.city);
//		System.out.println("pincode:"+ address.pincode);
//		System.out.println("city:"+ address.streetName);
//		
//	}
//	
//}
//class Address{
//	int doorNo;
//	String streetName;
//	String city;
//	int pincode;
//	public Address(int doorNo, String streetName, String city, int pincode) {
//		super();
//		this.doorNo = doorNo;
//		this.streetName = streetName;
//		this.city = city;
//		this.pincode = pincode;
//	}
//	
//}
//public class HasARelationship {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Address address=new Address(101, "btm", "banglore", 492111);
//		Employee employee=new Employee(1, "Satyam", );
//		employee.displayEmployeeInfo();
//	}
//
//}

