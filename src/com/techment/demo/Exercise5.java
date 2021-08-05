package com.techment.demo;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int monthNumber=scanner.nextInt();
		
		switch(monthNumber) {
		case 1:
			System.out.println("Birthday month is january");
			break;
		case 2:
			System.out.println("Birthday month is February");
			break;
		case 3:
			System.out.println("Birthday month is March");
			break;
		case 4:
			System.out.println("Birthday month is April");
			break;
		case 5:
			System.out.println("Birthday month is May");
			break;
		case 6:
			System.out.println("Birthday month is June");
			break;
		case 7:
			System.out.println("Birthday month is July");
			break;
		case 8:
			System.out.println("Birthday month is August");
			break;
		case 9:
			System.out.println("Birthday month is September");
			break;
		case 10:
			System.out.println("Birthday month is October");
			break;
		case 11:
			System.out.println("Birthday month is November");
			break;
		case 12:
			System.out.println("Birthday month is December");
			break;
		default:
			System.out.println("Invalid Input");
			break;
			
		}
	}
}