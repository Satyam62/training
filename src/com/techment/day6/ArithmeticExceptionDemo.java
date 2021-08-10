package com.techment.day6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		try {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int c=a/b;
		}
		
		catch(ArithmeticException e) {
			System.out.println(" do not give zero");
		}
		catch(InputMismatchException e) {
			System.out.println("give do not character only input number");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
