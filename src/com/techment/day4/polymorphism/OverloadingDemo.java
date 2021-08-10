package com.techment.day4.polymorphism;

class Hello{
	public void write(int num) {
		System.out.println(num);
	}
	public void write(String str) {
		System.out.println(str);
	}
	public int addition(int a,int b) {
		return a+b;
	}
	public int addition(int a,int b,int c) {
		return a+b+c;
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		
		Hello hello=new Hello();
		hello.write(5);
		hello.write("Hello World");
		System.out.println(hello.addition(5, 10));
		System.out.println(hello.addition(5,10,20));
	}

}
