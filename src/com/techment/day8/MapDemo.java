package com.techment.day8;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Sachin","he is a batsman");
		hm.put("Dravid", "he is a Wicket Keeper");
		hm.put("rahane","he is a Wicket Keeper");
		hm.put("dhoni","he is captain");
		System.out.println("hash hm : "+hm);
		/**
		 * printing both key and values
		 */
		System.out.println("printing the key and value : ");
		for(Entry<String,String> e:hm.entrySet()) {
			System.out.println("key : "+e.getKey());
			System.out.println("Value : "+e.getValue());
		}
		System.out.println("printing the values : ");
		for(String val:hm.values()) {
			System.out.println(val);
		}
		System.out.println("printing the key : ");
		for(String key:hm.keySet()) {
			System.out.println(key);
		}
	}

}
