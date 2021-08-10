package com.techment.day6.Exception;

public class Account {
	int b=5000;
	String withdraw(int amount) {
		if(amount>b)
			throw new InsufficientFundException("Insuffisient fund");
		else
			return "you have withdraw " + amount +" amount";
	}

}
