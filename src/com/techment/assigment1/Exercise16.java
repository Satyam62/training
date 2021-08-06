package com.techment.assigment1;
import java.util.Scanner;
public class Exercise16 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=scanner.nextInt();
		if((num%8==0) && (num%3==0))
			System.out.println("Number is divisible by 8 & 3");
		else
			System.out.println("Number is not divisible by 8 & 3");
		
		
	}

}
