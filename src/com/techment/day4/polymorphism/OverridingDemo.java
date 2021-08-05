package com.techment.day4.polymorphism;

class Bank{
	public void rateOfInterest() {
		System.out.println("3% ");
	}
	public void openAccount() {
		System.out.println("open Account ");
	}
	
	
}
class SBI extends Bank{
	public void rateOfInterest() {
		System.out.println("5% ");
	}
	public void loan() {
		System.out.println("you can apply for loan");
	}
}
class Axis extends Bank{

	public void rateOfInterest() {
		System.out.println("8% ");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
//		SBI sbi=new SBI();
//		Axis axis=new Axis();
//		sbi.rateOfInterest();
//		axis.rateOfInterest();
//		sbi.loan();
		
//		Bank bank=new SBI();//upcasting
//		bank.rateOfInterest();
//		//bank.loan(); // not access child sbi class method
//		bank.openAccount();
		
		Bank bank=new Axis();//upcasting
		bank.rateOfInterest();
		//bank.loan(); // not access child sbi class method
		bank.openAccount();
		
	}

}
