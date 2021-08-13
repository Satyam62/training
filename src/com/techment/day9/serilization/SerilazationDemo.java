package com.techment.day9.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class SerilazationDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		Employee emp1=new Employee(101, "Satyam");
		System.out.println("===serilization started====");

		FileOutputStream fos=new FileOutputStream("hello.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("===serilization completed====");
	}

}
