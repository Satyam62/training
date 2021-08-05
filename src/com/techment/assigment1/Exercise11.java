package com.techment.assigment1;
import java.util.Scanner;
public class Exercise11 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i = 1; i <= n;i++) 
	    { 

	        for(int j = 1; j <= n - i; j++) 
	        { 

	            System.out.print(j); 

	        } 

	        System.out.println();
	    }
	}

}
