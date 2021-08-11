package com.techment.day7;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {

	public static void main(String[] args) {

		ArrayList<String> a1=new ArrayList<String>();	
		a1.add("Sachin");
		a1.add("ravi");
		a1.add("kumar");
		a1.add("soumya");
		System.out.println("Element of a1 : "+a1);
		
		ArrayList<String> a2=new ArrayList<String>();	
		a2.add("sorabh");
		a2.add("manish");
		a2.add("Sachin");
		a2.add("ankit");
		a2.add("kumar");
		
		System.out.println("Element of a2 : "+a2);
		a2.addAll(a1);
		System.out.println("Merge Element of a1 and a2 : "+a2);
		a2.removeAll(a1);
		System.out.println("Element of (removeAll) a1 frow a2 "+a2);
		
		Collections.sort(a2);
		System.out.println("Sorting through collections : "+a2);		
	}
}




























