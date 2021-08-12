package com.techment.arrayAssignment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n=scanner.nextInt();
		int arr[] = new int[n];
		//int t;
		System.out.println("Enter Array Element : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();
		
		System.out.println("Before Sorting ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ "    ");
		int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                         if(arr[j-1] > arr[j]){  
                                //swap elements  
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                         
                }  
        }  
		System.out.println("\nAfter Sorting ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ "    ");
	}
}
