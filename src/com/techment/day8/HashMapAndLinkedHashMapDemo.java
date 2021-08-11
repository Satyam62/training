package com.techment.day8;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.LinkedHashMap;
public class HashMapAndLinkedHashMapDemo {

	public static void main(String[] args) {

		//It is Same like Dictionary
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "I");
		hm.put(2, "am");
		hm.put(3, "Satyam");
		hm.put(4, "Sahu");
		hm.put(5, ".");
		
		System.out.println("HashMap : "+hm);
		 
		for(Map.Entry map: hm.entrySet()) {
			System.out.println(map.getKey()+ " "+map.getValue());
		}
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1, "I");
		lhm.put(2, "am");
		lhm.put(3, "Satyam");
		lhm.put(4, "Sahu");
		lhm.put(5, ".");
		
		System.out.println("LinkedHashMap : "+lhm);
		 
		for(Map.Entry map: hm.entrySet()) {
			System.out.println(map.getKey()+ " "+map.getValue());
		}
//		for(Entry<String,String> e:hm.entrySet()) {
//			System.out.println("key : "+e.getKey());
//			System.out.println("Value : "+e.getValue());
//		}


	}

}
