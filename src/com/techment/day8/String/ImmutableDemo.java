package com.techment.day8.String;

public class ImmutableDemo {

	public static void main(String[] args) {

		
		String s="java";
		System.out.println("course Name : "+s);
		
		s.concat("programing");
		System.out.println("after concat: "+s);
		s=s.concat(" language");
		System.out.println(s);
	}

}
