package com.techment.oopsAssignment;

public abstract class PrepaidCard {
	int CardNo;
	double availableBalance;
	double swipeLimit;
	
	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	public void rechargeCard(double amount) {
		availableBalance+=amount;
		
	}

	abstract boolean swipeCard();
	
}
//•	Has attributes CardNo(int), availableBalance(double), swipeLimit(double)
//•	Abstract method swipeCard which takes amount as input and returns a boolean. 
//•	Override toString to get object details in a formatted way
//•	Concrete method rechargeCard which takes amount as input and adds it to availableBalance 