package com.techment.day4.encapsulation;


class Employee{
	private int id;
	private String name;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(1);
		System.out.println(employee.getId());
		employee.setName("Satyam");
		System.out.println(employee.getName());
		
		
		
//		employee.id=5;
//		employee.name="motu";
//		System.out.println("Emp id : "+employee.id);
//		System.out.println("Emp name : "+employee.name);
		

}
}