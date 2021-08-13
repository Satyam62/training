package com.techment.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	//////////////MapDemo1.java
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	///////////////////////////////
	
	
}

class AgeSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age)
		return 0;
		else if(o1.age>o2.age)
		return 1;
		else
			return -1;
	}
	
}

class NameSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> stuList = new ArrayList<Student>();
stuList.add(new Student(1, "mahesh", 23));
stuList.add(new Student(2, "rohit", 19));
stuList.add(new Student(3, "ankit", 20));

for(Student s :stuList)
{
	System.out.println(+s);
}
System.out.println("============================Sorting by age================");

Collections.sort(stuList,new AgeSorting());
for(Student s :stuList)
{
	System.out.println(s);
}
System.out.println("============================Sorting by Name================");

Collections.sort(stuList,new NameSorting());
for(Student s :stuList)
{
	System.out.println(s);
}
	}

}


//import java.util.ArrayList;
//import java.util.Collections;
//
//
//class Student
//{
//	int id;
//	String name;
//	int age;
//	public Student(int id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
//	
//}
//class AgeSorting implements Comparable<Student>
//{
//	@Override
//	public int compareTo(Student o1,Student o2) {
//		if(o1.age==o2.age)
//			return 0;
//		else if(o1.age>o2.age)
//			return 1;
//		return -1;
//		
//	}
//}
//class NameSorting implements Comparable<Student>
//{
//public int compare(Student o1, Student o2) {
//	
//		return o1.name.compareTo(o2.name);
//	}
//}
//public class ComparatorDemo {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Student> stuList =new ArrayList<Student>();
//		stuList.add(new Student(1,"mahesh",23));
//		stuList.add(new Student(3,"rohit",19));
//		stuList.add(new Student(2,"ankit",20));
//		for(Student student:stuList) {
//			System.out.println(student);
//		}
//		Collections.sort(stuList);
//
//		
//		System.out.println("sorting name");
//		for(Student student:stuList) {
//			System.out.println(student);
//		}
//		
//	}
//
//}
/**
 * 
 */
