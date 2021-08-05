package com.techment.assigment1;
import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print((i*i*i));
			if(i!=num)
				System.out.print(", ");
		}
}
}