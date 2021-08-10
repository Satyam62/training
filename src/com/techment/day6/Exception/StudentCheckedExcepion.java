package com.techment.day6.Exception;

class LateException extends Exception{
	public LateException(String msg) {
		super(msg);
	}
}
class Student{
	void login(int time)throws LateException{
		if(time>9)
			throw new LateException("absent");
		else
			System.out.println("present");
	}
}
public class StudentCheckedExcepion {

	public static void main(String[] args) {
		
		Student student=new Student();
		try {
			student.login(4);
		}
		catch(LateException e) {
			System.out.println(e.getMessage());
		}
	}
}
