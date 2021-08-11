package com.techment.day7;

import java.util.ArrayList;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList obj=new ArrayList();
		//any type of obj store
		obj.add(4);
		obj.add("Hello");
		
		//only integer obj store
		ArrayList<Integer> a =new ArrayList<Integer>(); //default capacity 10
		a.add(1);
		//a.add("hello");     

		//only string obj store 
		ArrayList<String> a1 =new ArrayList<String>(); //default capacity 10
		//a.add(1);
		a1.add("hello");   
	}
}
