package com.techment.assigment1;
import java.util.Scanner;
public class Exercise15 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of Array 1 : ");
		int n1=scanner.nextInt();
		System.out.println("\nEnter size of Array 2 : ");
		int n2=scanner.nextInt();
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		int c=0;
		System.out.println("Enter "+n1+"Elements of array 1 : ");
		for(int i=0;i<arr1.length;i++)
			arr1[i]=scanner.nextInt();
		System.out.println("Enter "+n2+"Elements of array 1 : ");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=scanner.nextInt();
		if(arr1.length!=arr2.length)
			System.out.println("Both the Array is not same");
		else {
			for(int i=0;i<arr1.length;i++) {
					if(arr1[i]!=arr2[i]) {
						c++;
						break;
					}
			}
			if(c==0)
				System.out.println("Both the array element is same");
			else
				System.out.println("Both the array element is same");
		}
	}

}
