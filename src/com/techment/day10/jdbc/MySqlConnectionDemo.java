package com.techment.day10.jdbc;
//com.mysql.cj.jdbc.Driver
public class MySqlConnectionDemo {

	public static void main(String[] args) {
		
		//A o new A();
		try {
			//class.forName("com.techment.day10.jdbc.A");
			//Class.forName("com.techment.day10.jdbc.A");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class is found");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}			
	}

}
