package com.techment.assigment1;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if(number%4==0) {
			if(number%100!=0) {
				System.out.println("Leap Year");
			}		
			else if(number%100==0 && number%400==0) 
				System.out.println("Leap Year");			
			else
				System.out.println("Not a Leap Year");			
			}
			else
				System.out.println("Not a Leap Year");			
		}
}
////leap year condition
//1.divide by 4 + not divide by 100 ---> leap
//2.divide by 4 + divide by 100 + not divide by 400 ----> leap
//3.divide 100 and 400 both ---> leap