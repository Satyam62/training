package com.techment.day7;

import java.util.ArrayList;

public class ModifyingDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();	
		a1.add(1);
		a1.add(4);
		a1.add(3);
		a1.add(6);
		a1.add(10);
		System.out.println("Element of a1 : "+a1);
		
		for(int i:a1) {
//			if(i>3)
//				a1.add(i);   // java.util.ConcurrentModificationException
//			System.out.println(i);
			
			if(i>3)
			//a1.remove(i);   
			System.out.println(i);	
		}	
	}
}
