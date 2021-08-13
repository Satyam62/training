package com.techment.collectionAssignemet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer
{
	private	LinkedList<Integer> runsData = new LinkedList<Integer> ();
	
	
//	LinkedList<Integer> cloneRunData   = (LinkedList<Integer>)runsData.clone();
	
		public LinkedList getRunsData() {
		return runsData;
	}
	
	public void setRunsData(LinkedList runsData) {
		this.runsData = runsData;
	}
	
		public ScoreAnalyzer(LinkedList runsData)
		{
			super();
			this.runsData = runsData;
		}
	 
		public ScoreAnalyzer() {
			// TODO Auto-generated constructor stub
		}

		public void addRunsToList(int run)
		{
			
			runsData.add(run);
		}
	
	public void calcRunRate() 
	{
//		System.out.println("runsData ="+runsData);
		double sum =0;
		double runRate;
		
		for(int j =0;j<runsData.size();j++)
		{
			sum =sum+(int)runsData.get(j);	
		}
		 runRate = sum/50;
		
		
		System.out.println("total run = "+sum);
		System.out.println("Run rate = "+runRate);
		
//		Collections.sort(runsData);
		
//		System.out.println(runsData);
		
	}
	
	public void displayRuns()
	{	 
		
		System.out.print("Score: ");
		 int j=1;
		 for (Integer listElement : runsData)
		 {  System.out.print("Player"+j+"-"+listElement + "  ");
	            j++;
	     }		 
	}
	
	public void lowestRunsScored()
	{int min=0;
	int indexVal=0;
	
	 
	 min = Collections.min(runsData);
	
	for(int j =0;j<runsData.size();j++)
		{ if(min== runsData.get(j))
			{ indexVal = j;	
			System.out.println("Player"+(indexVal+1)+" Lowest score = "+min);
			}
		}
		
	}
	
}



public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreAnalyzer scores = new ScoreAnalyzer();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many batsman run you want to enter =  ");
		int number = scanner.nextInt();
		
		
		if(number<=11)
		{		System.out.println("ok Total batsman is = "+number);
				System.out.println("========================================");
				System.out.println("Enter scores: ");
				Scanner scanRuns = new Scanner(System.in);
				
				for(int i=0;i<number;i++)
				{	System.out.print("Enter Score of  batsman "+(i+1)+" = ");
					scores.addRunsToList(scanRuns.nextInt());
				}
				System.out.println("========================================");
				scores.displayRuns();
				System.out.println("\n========================================");
				scores.calcRunRate();
				System.out.println("Total batsman is = "+number);
				scores.lowestRunsScored();
		}
		else 
		{
			System.out.println("In cricket match one teram has 11 player during match \nplease enter scores upto 11 player or less than 11 only!!");
			
		}
	}

}
/**

package com.techment.collectionAssignemet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


class ScoreAnalyzer
{
	private LinkedList runData=new LinkedList();

	public ScoreAnalyzer(LinkedList runData) {
		super();
		this.runData = runData;
	}
	public void addRunsToList(int runData) {
		System.out.print(runData+ " ");
	}
	public void calcRunRate(float runrate) {
		System.out.println("\nRun Rate : "+runrate);
	}
	public int lowestRunsScored(LinkedList lowest){
		return 0;
		
	}
	public void displayRuns(LinkedList scored) {
		
	}
	
}
public class TestScoreAnalyzer {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter How Many Runs You Scored : ");
		int runs=scanner.nextInt();
		LinkedList<Integer> lr=new LinkedList<Integer>();
		int r;
		System.out.println("\nEnter Runs : ");
		for(int i=0;i<runs;i++) {
			r=scanner.nextInt();
			lr.add(r);
		}
		float s=0;
		ScoreAnalyzer obj=new ScoreAnalyzer(lr);
		for(int i=0;i<runs;i++) {
		obj.addRunsToList((int) lr.get(i));
		s=s+((int)lr.get(i));
		}
		s= (s/(runs*10));
		obj.calcRunRate(s);
		
		System.out.println("Count of player who batted : "+runs);

		
	}

}
/**
2 – Cricket Score Analyzer
Create a Class ScoreAnalyzer with a private instance variable 'runsData' of type LinkedList.
The linkedlist will store runs scored by individual players in One Day Cricket match.
Create a constructor and initialize runsData variable.

•	Create a method addRunsToList which accepts runs scored by a player as parameter and stores it in the List.
•	Create a method calcRunRate which returns the runRate (Consider all 50 overs were played by a team).
•	Create a method lowestRunsScored to return the lowest runs scored by a player.
•	Create a method displayRuns to display the runs scored by all players.(use for each loop)

Create class TestScoreAnalyzer with a main method. 
•	Create an object of ScoreAnalyzer
•	Use Scanner to get the runs scored and use addRuns method to store the runs
•	Display the runs scored by all players
•	Display the runrate
•	Display the lowest runs scored
•	Display the count of player who did batting

Sample input
Enter Runs
20 30 150 50 2
 
Sample Output
Runs Scored : 1-20 2-30 3-150 4-50 6-2
Runrate : 5.04
Lowest Runs : 2
Count of player who batted: 5

*/