package com.techment.day4.polymorphism;

class Bike
{
	   void run()
	   {
		   System.out.println("running");
	   
	   }
}
	  
	 class Splender extends Bike{
	   void run()
	   {
		   System.out.println("running safely with 60km");
		   }
	   }
	 
public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		Bike b = new Splender();//upcasting
	     b.run();
		
	}

}
