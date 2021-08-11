package com.techment.day8.codingPracticeAssignment;
class Employee1
{

	private String firstName;
	private String lastName;
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
public class Assignment3 {

	public static void main(String[] args) {
		Employee1 empl1=new Employee1("Satyam", "Sahu");
		try {
			
			if(empl1.getFirstName().length()<3 && empl1.getLastName().length()<3 ) 
				throw new NullPointerException("Name Should be Minimum 3 Character");
			else if(empl1.getFirstName()==null && empl1.getLastName()==null)
				throw new NullPointerException("Entry Missing");
				
			System.out.println("Everything will be good");
			
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}

	}
}
/**
3)create a Employee class and declare 
private String firstName,
private String lastName
and initilize the values using constructor
Validation Method ---> it will check for 2 exception
a)if the firstName and lastName is null throw NullPointerException saying("Entry Missing")
b)if the firstName and LastName length is less than 3 then it should show exception saying 
name should be minimum 3 characte
*/