package com.techment.task;
public class Customer {
	int id;
	String name;
	double phno;
	double minBalance;
	Customer(){
		id=0;
		name="abc";
		phno=1235;
	    minBalance=0;
		System.out.println("default cosntructor called");
	}
	Customer(int id,String name,double phno,double minBalance){
		System.out.println("parameterized constructor called");
		this.id=id;
		this.name=name;
		this.phno=phno;
	    this.minBalance=minBalance;
	}
	public void customerDetails() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("phno : "+phno);
		System.out.println("minBalance : "+minBalance);
	}
	public String accountCheck() {
		if(minBalance>=0 && minBalance<1000)
			return "zero balance account";
		else if(minBalance>=1000&& minBalance<10000)
			return "Saving account";
		else
			return "current account";
	}
	public static void main(String[] args) {
		
		Customer cust1=new Customer();
		cust1.customerDetails();
		Customer cust2=new Customer(2,"ravi",222222,2000);
		cust2.customerDetails();
		Customer cust3=new Customer(3,"bhaavi",343222,99200);
		cust3.customerDetails();
		System.out.println("Account Checking = \n"+cust1.accountCheck());
		System.out.println("Account Checking = \n"+cust2.accountCheck());
		System.out.println("Account Checking = \n"+cust3.accountCheck());
	}

}
