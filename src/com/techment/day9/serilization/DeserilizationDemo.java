package com.techment.day9.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
public class DeserilizationDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException{

		FileInputStream fis=new FileInputStream("hello.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee) ois.readObject();
		System.out.println(e.id);
		System.out.println(e.name);
		
	}

}
