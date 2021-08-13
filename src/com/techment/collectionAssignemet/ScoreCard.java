package com.techment.collectionAssignemet;
import java.util.*;
public class ScoreCard {
	
	public static void main(String[] args) {
// TODO Auto-generated method stub
		
//		HashMap hm = new HashMap();
		int TotalScore =0;	
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Rahul",35);
		hm.put("Dhoni",150);
		hm.put("Kohli",45);		
		hm.put("Rahane",20);
		hm.put("Rohit", 200);
				
		TreeMap<String,Integer> sorted = new TreeMap(hm);
		
		System.out.println("\nPlayers who batted");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
			System.out.println(entry.getKey());
			
		}
		
		System.out.println("\nScores  by players");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{	
			TotalScore = TotalScore+entry.getValue();
			System.out.println( entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("\nTotalScore : "+TotalScore);
		
		System.out.print("\nHighest scorer : ");			
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		    
		}
		System.out.println(maxEntry.getKey());
	
		System.out.println("Runs Scored by Dhoni : "+ sorted.get("Dhoni"));
		
		
		
	}

}
/**package com.techment.collectionAssignemet;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
public class ScoreCard {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter How many Person : ");
		int n=sc.nextInt();
		System.out.println("Enter Runs Scored : ");
		String str;
		Integer run;
		for(int i=0;i<n;i++) {
			System.out.println("Enter Name");
			str=sc.next();
			System.out.println("Enter runs");
			run=sc.nextInt();
			hm.put(str, run);
		}
		System.out.println("Players who batted : ");
		for(Entry<String,Integer> e:hm.entrySet()) {
			System.out.println(e.getKey());	
		}
		System.out.println("Scores by Players : ");
		for(Entry<String,Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+" :  "+e.getValue());	
		}
		int sum=0;
		for (int s : hm.values()) {
		    sum += s;
		}
		System.out.println("Total Scores : "+sum);
		

		
	}
}

/**
 3 – ScoreCard
Create a class ScoreCard with a main method to analyze the runs scored by batsmen of a team. The input data format is given below. 
The program needs to output as given below. Use a concrete class of Map to achieve the functionality.
Sample Input
-------------
Enter Runs Scored
Rahane-20 Rahul-30 Kohli-150 Dhoni-50 Lokesh-2


Sample Output
-------------
Players who batted
Dhoni
Kohli
Lokesh
Rahane
Rahul

Scores by Players
Dhoni : 50
Kohli : 150
Lokesh : 2
Rahane : 20
Rahul  : 30

Total Score : 202

Name of Highest Scorer : Kohli

Runs Scored by Dhoni : 50

 */