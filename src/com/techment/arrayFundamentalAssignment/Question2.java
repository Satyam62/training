package com.techment.arrayFundamentalAssignment;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		//int a[]=new int[5];
		int a[] = {1,4,34,56,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				c=i+1;
				break;
			}
		}
		if(c!=0) {
			System.out.println(c);
		}
		else
			System.out.print("-1");
	}

}
//int temp = 0;  
//for(int i=0; i < n; i++){  
//        for(int j=1; j < (n-i); j++){  
//                 if(arr[j-1] > arr[j]){  
//                        //swap elements  
//                        temp = arr[j-1];  
//                        arr[j-1] = arr[j];  
//                        arr[j] = temp;  
//                }  
//                 
//        }  
//}  
