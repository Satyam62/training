package com.techment.day8.codingPracticeAssignment;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size of array  : ");
		int n=scanner.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Person Ages : ");
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
		}
		int children=0,adult=0,senior=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<18) {
				children++;
			}
			else if(a[i]>=18 && a[i]<54) {
				adult++;
			}
			else
				senior++;
		}
		System.out.println("Children : "+children);
		System.out.println("Adult : "+adult);
		System.out.println("Senior Citizen : "+senior);
		
	}

}
/**
 * 
 Create a integer array to store the person age by taking input from user.
If the person age is <18 it as children 
If the person age is >=18 to 54 it as adult
If the person age is >=55 it senior citizen 
Count how many children,adult,and senior citizen.
Eg:
 Int age[]={34,78,56,7,12,67,20,50}
Display output as
 Children : 1
 Adult : 3
 Senior Citizen: 3
 */
