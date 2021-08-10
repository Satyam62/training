//package com.techment.day6;
//
//class Student{
//	void checkEligibilty(int age) throws FileNotFoundException{
//		if(age>=18) {
//			System.out.println("You can apply for loans");
//		}
//		else
//			throw new FileNotFoundException("you cannot apply for loan");
//	}
//}
//public class ThrowsDemo {
//
//	public static void main(String[] args)  {
//		
//		Student student=new Student();
//		student.checkEligibilty(15);
//	}
//
//}
package com.techment.day6;

class Student{
	void checkEligibilty(int age) {
		if(age>=18) {
			System.out.println("You can apply for loans");
		}
		else
			throw new ArithmeticException("you cannot apply for loan");
	}
	
}
public class ThrowsDemo {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.checkEligibilty(19);
	}

}
