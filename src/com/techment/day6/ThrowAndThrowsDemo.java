package com.techment.day6;
class AgeException extends RuntimeException{
	String msg;
	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
}
class IdNotFondException extends Exception{
	String msg;

	public IdNotFondException(String msg) {
		super();
		this.msg = msg;
	}
}
public class ThrowAndThrowsDemo {
	public static void main(String[] args) throws IdNotFondException{
		throw new IdNotFondException("NOt Good Message for you");
		
	}
}

//package com.techment.day6;
//class AgeException extends RuntimeException{
//	String msg;
//	public AgeException(String msg) {
//		super();
//		this.msg = msg;
//	}
//}
//class IdNotFondException extends Exception{
//	String msg;
//
//	public IdNotFondException(String msg) {
//		super();
//		this.msg = msg;
//	}
//}
//public class ThrowAndThrowsDemo {
//	public static void main(String[] args) {
//		throw new AgeException("NOt Good Message for you");
//		
//	}
//}
