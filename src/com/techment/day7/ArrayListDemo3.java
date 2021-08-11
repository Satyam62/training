package com.techment.day7;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		ArrayList<Integer> a1=new ArrayList<Integer>();	
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("Element of a1 : "+a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();	
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		
		System.out.println("Element of a2 : "+a2);
		a2.addAll(a1);
		System.out.println("Element of (addAll) a1 and a2 : "+a2);
		a2.removeAll(a1);
		System.out.println("Element of (removeAll) a1 frow a2 "+a2);
		
		a2.retainAll(a2);
		System.out.println("retainAll  : "+a2);
		Collections.sort(a1);
		System.out.println("Sorting throurg collection : "+a1);
		

	}

}
