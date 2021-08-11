package com.techment.assigment1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int weight1=scanner.nextInt();
		int weight2=scanner.nextInt();
		int weight3=scanner.nextInt();
		
		if(weight1==weight2 & weight1==weight3) {
			System.out.println("Entered weights are distinct values");
		}
		else {
			if((weight1>weight2) && (weight1>weight3))
				System.out.println("Largest Weight of Horse 1 is "+ weight1);
		
			else if((weight2>weight3))
				System.out.println("Largest Weight of Horse 2 is "+ weight2);
				
			else
				System.out.println("Largest Weight of Horse 3 is "+ weight3);
			
		}
		
//		if((weight1>=weight2) && (weight1>=weight3))
//			System.out.println("Largest Weight of Horse 1 is "+ weight1);
//		
//		else if((weight2>=weight1) && (weight2>=weight3))
//			System.out.println("Largest Weight of Horse 2 is "+ weight2);
//				
//		else
//			System.out.println("Largest Weight of Horse 3 is "+ weight3);

	}

}
