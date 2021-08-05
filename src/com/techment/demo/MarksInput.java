package com.techment.demo;
import java.util.Scanner;
public class MarksInput {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 int sum=0,t,c=0;
		 System.out.println("Enter how many marks do you want to enter : ");
		 int mn=scanner.nextInt();
		 int marks[]=new int[mn];
		 System.out.println("Input all the marks : ");
		 for(int i=0;i<mn;i++) {
			 marks[i]=scanner.nextInt();
		 }
		 System.out.println("Show all the marks : ");
		 for(int i=0;i<mn;i++) {
			System.out.println(marks[i]);
			sum+=marks[i];
		 }		
		 System.out.println("Sum of all the marks : "+ sum);
		 
		 System.out.println("display lowest marks and Heighest marks");
		 for(int i=0;i<mn-i;i++) {
			 for(int j=0;j<mn-i-1;j++) {
				 if(marks[j]>marks[j+1]) {
					 t=marks[j];
					 marks[j]=marks[j+1];
					 marks[j+1]=t;
							 
				 }
			 }
		 }
		 System.out.println("Lowest marks is : "+ marks[0]);
		 System.out.println("Heighest marks is : "+ marks[mn-1]);
		 System.out.println("2nd Heighest marks is : "+ marks[mn-2]);
		 for(int i=0;i<mn;i++) {
			 if(marks[i]<40)
				 c=c+1;
		 }
		 if(c==0) {
			 System.out.println("pass");
		 }
		 else
			 System.out.println("fail");
	}

}
