package com.techment.assigment1;
import java.util.Scanner;
public class Exercise13 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter how any product do you have : \n");
		int n=scanner.nextInt();
		int c=0;
		int product[] = new int[n];
		for(int i=0;i<product.length;i++)
			product[i]=scanner.nextInt();
		for(int i=0;i<product.length;i++) {
			if((product[0]<product[i])) {
				product[0]=product[i];
				c=i+1;
			}
		}
		System.out.println("Product "+c+" has maximum quantity "+product[0]);

	}

}
