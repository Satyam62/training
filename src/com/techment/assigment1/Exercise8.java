package com.techment.assigment1;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int t=num;
		int rem,s=0;
		while(t>0) {
			rem=t%10;
			s=s+ (rem*rem*rem);
			t=t/10;
		}
		if(num==s) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not Armstrong Number");
	}

}
