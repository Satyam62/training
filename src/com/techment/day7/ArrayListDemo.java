package com.techment.day7;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		
			ArrayList obj = new ArrayList();
			System.out.println("size before adding element : "+obj.size());
			obj.add(5);
			obj.add("Satyam");
			obj.add(4.50);
			System.out.println("size after adding element : "+obj.size());
			System.out.println("element in the list :  "+obj);
			
			obj.add(1,"Akshat");
			System.out.println("element in the list :  "+obj);

			obj.remove("Akshat");
			System.out.println("element in the list :  "+obj);

			obj.remove(Integer.valueOf(1));
			System.out.println("element in the list :  "+obj);
			
			System.out.println("element at 2nd index : "+obj.get(2));
			
			
			
	}

}
