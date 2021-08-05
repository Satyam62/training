package com.techment.demo;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
		for(int i=10;i>=1;i--) {
			System.out.println(i+" ");
			s=s+i;
		}
		System.out.println("sum :"+s);
	}
}
