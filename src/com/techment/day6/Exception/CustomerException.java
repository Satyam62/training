package com.techment.day6.Exception;

public class CustomerException {

	public static void main(String[] args) {


		Account account=new Account();
		try {
			System.out.println(account.withdraw(20000));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
