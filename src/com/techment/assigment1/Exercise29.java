package com.techment.assigment1;
import java.util.Scanner;

public class Exercise29 extends Exception{

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 sides of Triangle : ");
		int a,b,c;
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		int sq1,sq2,sq3;
		sq1 = b*b +c*c;
		sq2 = a*a +b*b;
		sq3 = a*a +c*c;
		
		if((sq1==(a*a))||(sq2==(b*b))||(sq3==(c*c)))
			System.out.println("It is Right Angle Triangle");
		else
			System.out.println("It is not a right Angel Triangle");
		
	}

}
