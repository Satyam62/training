package com.techment.demo;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int tableName=scanner.nextInt();
		int limit=scanner.nextInt();
		for(int i=1;i<=limit;i++) {
			System.out.println(tableName+"*"+i+"  =  "+ tableName*i);
		}

	}
}

//package com.techment.demo;
//
//public class Hello {
//
//	public static void main(String[] args) {
//		System.out.println("Hello Techment");
//		int a=5 ;
//		int b;
//		b=a++ + ++a - a--;
//		System.out.println(b);
//		a=5;
//		b=++a + a-- +--a;
//		System.out.println(b);
//
//	}
//
//}
