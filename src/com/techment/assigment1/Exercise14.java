package com.techment.assigment1;
import java.util.Scanner;
public class Exercise14 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter how any product do you have : \n");
		int n=scanner.nextInt();
		int sum=0;
		int product[] = new int[n];
		for(int i=0;i<product.length;i++)
			product[i]=scanner.nextInt();
		for(int i=0;i<product.length;i++) {
			sum=sum+product[i];
		}
		System.out.println("Total Product quantity is : "+sum);

	}

}
