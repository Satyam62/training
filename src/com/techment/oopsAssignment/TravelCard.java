package com.techment.oopsAssignment;

public class TravelCard extends PrepaidCard implements Rewardable
{
	int rewardPoints;

	@Override
	boolean swipeCard() {
		
		
		return false;
	}
}
/**
•	subclass of PrepaidCard
•	Has attribute rewardPoints. 
•	Travel Card implements the Rewardable interface for calculating reward points. 
•	Interface Rewardable has a method which takes amount as input and returns reward points
*/
