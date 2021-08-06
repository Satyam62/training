package com.techment.arrayFundamentalAssignment;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of Array 1 : ");
		int n1=scanner.nextInt();
		int c=0;
		System.out.println("Enter size of Array 2 : ");
		int n2=scanner.nextInt();
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		System.out.println("Enter Elements of Array 1 : ");
		for(int i=0;i<n1;i++)
			a1[i]=scanner.nextInt();
		System.out.println("Enter Elements of Array 2 : ");
		for(int i=0;i<n2;i++)
			a2[i]=scanner.nextInt();
		
		int a[] = new int[n1+n2];
		System.out.println("Merged Array is : ");
		for(int i=0;i<(n1+n2);i++) {
			if(i<n1) {
				a[i]=a1[i];
			}
			else {
				a[i]=a2[c];
				c++;
			}
	}
		for(int i=0;i<(n1+n2);i++) {
			System.out.print(a[i]+"  ");
		}
	}

}


