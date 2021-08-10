package com.techment.assigment1;

public class Exercise19 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=7-i;k++) {
				System.out.print(k);
			}
			for(int c=5;c>=1;c--) {
				if((c-i+1)>=1)
				System.out.print(c-i+1);
			}
			System.out.println();
		}
	}
}

//1 2 3 4 5 6 5 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 2 1 
//1 2 1 
//1