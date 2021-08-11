package com.techment.day7;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> a1=new ArrayList<Integer>();	
		a1.add(1);
		a1.add(4);
		a1.add(3);
		a1.add(6);
		a1.add(10);
		System.out.println("Element of a1 : "+a1);
		
		ListIterator<Integer> itr=a1.listIterator();
		
		System.out.println("forward Direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("Backward Direction ");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
