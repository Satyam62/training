package com.techment.task;

class Parent2{
	int a;
	Parent2(int a){
		System.out.println("This is parent 2 constructor"+a);
	}
	
}
class Child2 extends Parent2{
	Child2(int x){
		super(x);
		System.out.println("This is Child 2 constructor");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		
		Child2 child2=new Child2(222);
	}

}
