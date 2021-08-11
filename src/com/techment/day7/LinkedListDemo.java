package com.techment.day7;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList o1 = new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.addFirst(100);
		o1.add(3);
		o1.addLast(400);
		System.out.println("LinkedList : "+o1);
		
		o1.removeLast();
		System.out.println(o1);
		o1.removeFirst();
		System.out.println(o1);
	}

}
