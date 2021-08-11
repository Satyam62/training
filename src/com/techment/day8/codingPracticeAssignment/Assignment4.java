package com.techment.day8.codingPracticeAssignment;

class Animal{
	
	public void shout() {
		System.out.println("This is Animal Shout ");
	}
}
class Dog extends Animal{
	public void shout() {
		System.out.println("This is Dog Shout ");
	}
}
class Cat extends Animal{
	public void shout() {
		System.out.println("This is Cat Shout ");
	}
}
class Hourse extends Animal{
	public void shout() {
		System.out.println("This is Hourse Shout ");
	}
}
public class Assignment4 {

	public static void main(String[] args) {

			Animal d=new Dog();
			d.shout();
			Animal c=new Cat();
			c.shout();
			Animal h=new Hourse();
			h.shout();
			
	}

}
/**
)There is an animal class which has the common characteristics of all animals. Dog, Horse, 
Cat are animals(sub-class) of animal. Each can shout, but each shout is different. Use 
polymorphism to create objects of same and using an animal variable, make each of the 
animals shout.
Note:use runtime polymorphism
*/