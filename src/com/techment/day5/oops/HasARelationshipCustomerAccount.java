package com.techment.day5.oops;
class Customer
{
	int custid;
	String custname;
	Account account;  //object reference(has-a relation)
	public Customer(int custid, String custname, Account account) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.account = account;
	}
	void displayCustomerInfo()
	{
		System.out.println("custId:"+ custid);
		System.out.println("custname:"+ custname);
		System.out.println("accountNo:"+ account.accountNo);
		System.out.println("accountType:"+ account.accountType);
		System.out.println("ifsc:"+ account.ifsc);
		System.out.println("branch:"+ account.branch);		
	}
}
class Account
{
	int accountNo;
	String accountType;
	String ifsc;
	int balance;
	String branch;
	public Account(int accountNo, String accountType, String ifsc, int balance, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.ifsc = ifsc;
		this.balance = balance;
		this.branch = branch;
	}
	
	 
}
public class HasARelationshipCustomerAccount {

	public static void main(String[] args) {

		Account account = new Account(101,"saving", "SBI0012",45683,"Santoshi Nagar");
		Customer customer = new Customer(1,"Satyam",account); //object reference(has-a relation)
		customer.displayCustomerInfo();
	}

}
