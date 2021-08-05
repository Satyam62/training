package com.techment.task;

class Parent1{
	int a=10;
}
class Child1 extends Parent1{
	int a=5;
	void sum() {
		int c=a+a;
		System.out.println("sum c: "+c);
		int d=this.a+a;
		System.out.println("sum d: "+d);
		//int e=super()+a;
		//System.out.println("sum e: "+e);
	}
}
public class SuperVariableDemo {

	public static void main(String[] args) {
		Child1 child=new Child1();
		child.sum();
	}

}
