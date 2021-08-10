package com.techment.day6;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("name is Satyam");
		System.out.println("email is satyam@techment");
		
		int a[] =new int[5];
		try {
		System.out.println(1/0);
		a[7]=22;
		System.out.println(8/2);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array size isfive");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Dont give zero");
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println("contact 123456789");

	}

}
