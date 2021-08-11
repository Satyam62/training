package com.techment.day8;

import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable<Employee>
{
	
	int id;
	String name;
	int age;
	String dept;
	public Employee(int id, String name, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
	
	public int compareTo(Employee e) {
		if (this.age==e.age)
			return 0;
		else if(this.age>e.age) {
			return 1;
		}
		else
			return -1;
	}
	
}
public class UserDefinedExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(4, "ramesh", 34, "hr"));
		employees.add(new Employee(2, "anil", 45, "manager"));
		employees.add(new Employee(3, "mahesh", 26, "hr"));
		employees.add(new Employee(1, "manoj", 30, "developer"));
		
		System.out.println("before sorting on the bases of age : ");
		for(Employee emp: employees) {
			System.out.println(emp.id+"  "+emp.name+"  "+emp.age+"  "+emp.dept);
		}
		Collections.sort(employees);
		System.out.println("after sorting on the bases of age : ");
		for(Employee emp: employees) {
			System.out.println(emp.id+"  "+emp.name+"  "+emp.age+"  "+emp.dept);
		}

	}

}
