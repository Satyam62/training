package com.techment.assigment1;
import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		int n=5,k1=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}			
			for(int c=5-i+1;c<5;c++) {
				System.out.print((c));
			}
			for(int k=1;k<=i;k++) {
				k1=k;
				System.out.print((6-k1));
			}
			System.out.println();
			
		}
	}

}
