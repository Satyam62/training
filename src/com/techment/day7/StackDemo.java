package com.techment.day7;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		
		Stack s1=new Stack();
		
		s1.push(1);
		s1.add(2);
		s1.push(3);
		System.out.println("Elements of Stack : "+s1);
		
		s1.pop();
		System.out.println("Elements of Stack : "+s1);
		
		System.out.println("Top Elements of Stack : "+s1.peek());
		s1.pop();
		System.out.println("Elements of Stack : "+s1);
		s1.pop();
		System.out.println("Elements of Stack : "+s1);

	}

}
