package com.techment.assigment1;
import java.util.Scanner;
public class Exercise18 extends Exception{

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		try {
			System.out.println("a : ");
			int a=scanner.nextInt();
			System.out.println("b : ");
			int b=scanner.nextInt();
			int c=a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Inside finally block");
		}
		
	}

}
