package com.techment.day7;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();	
		a1.add(1);
		a1.add(4);
		a1.add(3);
		a1.add(6);
		a1.add(10);
		System.out.println("Element of a1 : "+a1);
		
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
