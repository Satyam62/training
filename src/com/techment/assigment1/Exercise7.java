package com.techment.assigment1;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first : ");
		int first=scanner.nextInt();
		System.out.println("Enter last : ");
		int last=scanner.nextInt();
		System.out.println("Enter Soldiers number : ");
		int soldier=scanner.nextInt();
			if(soldier>=first && soldier<=last) {
				System.out.println("Soldier number is between "+first+" & "+last);
			}
			else
				System.out.println("Soldier number is not between "+first+" & "+last);

	}
}
