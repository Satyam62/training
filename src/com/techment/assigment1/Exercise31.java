package com.techment.assigment1;
import java.util.Scanner;

public class Exercise31 extends Exception{

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num;
		num=scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+"  =  "+(num*i));
		}

	}

}
