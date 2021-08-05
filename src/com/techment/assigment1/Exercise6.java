package com.techment.assigment1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Num1 : = ");
		int num1=scanner.nextInt();
		System.out.println("operator : = ");
		int operatorInput=scanner.next().charAt(0);
		System.out.println("Num2 : = ");
		int num2=scanner.nextInt();
		switch(operatorInput) {
		case '+' :
			System.out.println("Addition : "+ (num1+num2));
			break;
		
		case '-':
			System.out.println("Subtraction : "+ (num1-num2));
			break;
		
		case '*':
			System.out.println("Multiplication : "+ (num1*num2));
			break;
		
		case '/':
			System.out.println("Division : "+ (num1/num2));
			break;
		default :
			System.out.println("Wrong Input");
			break;
		}

	}

}
