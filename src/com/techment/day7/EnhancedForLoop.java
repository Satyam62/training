package com.techment.day7;

import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {
	
		ArrayList<Integer> a1=new ArrayList<Integer>();	
		a1.add(1);
		a1.add(4);
		a1.add(3);
		a1.add(6);
		a1.add(10);
		System.out.println("Element of a1 : "+a1);
		
		for(Integer a:a1) {
			System.out.println(a);
		}
		
		for(int a:a1) {
			System.out.println(a);
		}

	}

}
