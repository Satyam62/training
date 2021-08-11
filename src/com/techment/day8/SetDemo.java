package com.techment.day8;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(12);
		hs.add(12);
		hs.add(41);
		hs.add(2);
		System.out.println("hashSet : "+hs);

		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(1);
		lhs.add(12);
		lhs.add(12);
		lhs.add(41);
		lhs.add(2);
		System.out.println("linkedhashSet : "+lhs);
		
		//treest is used for sorting order in ascending order
		//remove duplicate
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(12);
		ts.add(12);
		ts.add(41);
		ts.add(2);
		//ts.add("sachin");
		System.out.println("TreeSet : "+ts);
		//It is Same like Dictionary
		HashMap hm=new HashMap();
		hm.put(1, "I");
		hm.put(2, "am");
		hm.put(3, "Satyam");
		hm.put(4, "Sahu");
		hm.put(5, ".");
		
		System.out.println("HashMap : "+hm);
		//System.out.println("HashMap : "+hm);
		
		
	}

}
