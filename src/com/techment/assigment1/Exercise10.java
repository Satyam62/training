package com.techment.assigment1;
import java.util.Scanner;
public class Exercise10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int status=1;
		int num=3;
		if (n >= 1)
	      {
	         System.out.println("First "+n+" prime numbers are:");
	         System.out.println(2);
	      }

	      for ( int i = 2 ; i <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
	      }         
	   }
		
	}

