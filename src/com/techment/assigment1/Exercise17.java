package com.techment.assigment1;
import java.util.Scanner;
public class Exercise17 extends Exception{

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age=scanner.nextInt();
		try {
			if(age>18) 
				System.out.println("Welcome to Vote");
			else
				throw new Exception("Invalid Age Exception occured"); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
