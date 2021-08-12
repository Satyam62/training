package com.techment.arrayAssignment;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size=scanner.nextInt();
		int arr[] = new int[size];
		int t;
		for(int i=0;i<arr.length;i++)
			arr[i]=scanner.nextInt();
					
		for(int i=0;i<(size-i);i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[i]>arr[j]) {
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println("Smallest 2 numbers are "+arr[size-1]+"  &  "+arr[size-2]);
		System.out.println("Largest 2 numbers are "+arr[0]+"  &  "+arr[1]
				);

	}

}


























//package com.techment.arrayFundamentalAssignment;
//import java.util.Scanner;
//public class Question1 {
//
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter size of Array 1 : ");
//		int n1=scanner.nextInt();
//		int arr2[] = new int[n2];
//	}
//
//}
//

