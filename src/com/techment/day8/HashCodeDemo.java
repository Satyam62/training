package com.techment.day8;

public class HashCodeDemo {

	public static void main(String[] args) {
		
		//in java String is object
		String a="hello";
		String b="java";
		String c="java";
		Integer x=123;
		//hashCode() //
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(x.hashCode());
		
	}

}
