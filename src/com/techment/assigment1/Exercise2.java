package com.techment.assignment1;
import java.util.Scanner;
 
public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if(n>=1 && n<=31) {
			if(n%2==0)
				System.out.println("Cars with Even registration \r\n" + "numbers are permitted today");
			else
				System.out.println("Cars with Odd registration \r\n" + "numbers are permitted today");
		}
		else
			System.out.println("Invalid Input Number");

	}

}
