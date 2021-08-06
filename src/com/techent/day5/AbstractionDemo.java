package com.techent.day5;

abstract class Bank{
	
	void Eligibility() {
		System.out.println("Above 18 can open account");
	}
	abstract int rateOfInterest(int interestRate); 
}
//when any class extends abstract means,it
//need to provide the implementation

class Axis extends Bank{
	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("Axis interestRate = "+interestRate);
		interestRate=2*interestRate;
		return interestRate;
	}
}
class Kotak extends Bank { 
	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("Kotak interestRate = "+interestRate);
		interestRate=2*interestRate;
		return interestRate;
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		 Bank bank1=new Axis();
		 System.out.println(bank1.rateOfInterest(6));

		 Bank bank2=new Kotak();
		 System.out.println(bank2.rateOfInterest(10));

	}

}
