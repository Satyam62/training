package com.techment.demo;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int digit,sum=0;
		while(number>0) {
			digit=number%10;
			number=number/10;
			sum=sum+digit;
		}
		System.out.println("Exit Door");
			
		
		
		
//		int a=scanner.nextInt();
//		int b=scanner.nextInt();
//		
//		if((a+b) <=18 && (a+b) >=1) {
//			System.out.println("Exit Door");
//		}
		

	}

}
