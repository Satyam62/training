package com.techment.demo;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
//		for(int j=1;j<=5;j++) {
//			System.out.print("*");
//		}
		if(i==1 || i==5){
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
		}
		else {
			for(int j=1;j<=i;j++) {
				if(j==1 || j==3) {
					System.out.print("*");
					break;
				}
				else {
					System.out.print(" ");
					break;
			}
			}
		}
			
		System.out.println();
	}
		
		
		
//		*
//		* *
//		* * *

		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		1
//		1 2
//		1 2 3	
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
//		1
//		23
//		456
		
		int c=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c=c+1;
			}
			System.out.println();
		}
//		* 
//		 * 
//		  *	

	}

}
