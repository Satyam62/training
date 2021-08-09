package com.techment.assigment1;
import java.util.Scanner;

public class Exercise20 extends Exception{

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=scanner.nextInt();
		int a[]= new int[n];
		System.out.println("Enter Elements of Array :");
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		
		try {
			System.out.println("Enter index number : ");
			int index=scanner.nextInt();
			System.out.println("Array is : "+a[index]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Inside finally block");
		}
		
		
	}

}
