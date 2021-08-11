package com.techment.day7;

import java.util.ArrayList;

class Employee{
	private int id;
	private String name;
	private String dept;
	
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
//	int id;
//	String name;
//	String dept;
//	public Employee(int id, String name, String dept) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.dept = dept;
//	}
	
}
public class UserDefinedType {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1,"Satyam", "hr");
		Employee emp2=new Employee(2,"ravi", "hr");
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3,"sourabh","developer"));
		
		
		for(Employee emp : employees) {
			if(emp.getId()>2)
				emp.setDept(("Manager"));
				
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDept());
			
		}
		
		
		
		
//		Employee emp1=new Employee(1,"Satyam", "hr");
//		Employee emp2=new Employee(2,"ravi", "hr");
//		
//		ArrayList<Employee> employees=new ArrayList<Employee>();
//		employees.add(emp1);
//		employees.add(emp2);
//		employees.add(new Employee(3,"sourabh","developer"));
//		
//		for(Employee emp : employees) {
//			System.out.println(emp.id+" "+emp.name+" "+emp.dept);
//			
//		}
//		employees.set(1,new Employee(100, "mahesh", "Principal"));
//		
//		for(Employee emp : employees) {
//			System.out.println(emp.id+" "+emp.name+" "+emp.dept);
//			
//		}
		
		
	}

}
