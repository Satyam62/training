package com.techment.day6;

import java.io.FileNotFoundException;

public class CheckedAndUncheckedException {

	public static void main(String[] args) {
		
		
		//Runtime Exception
		 //throw new ArithmeticException("Some Thing went wrong"); 
		//compile Exception
		//throw new FileNotFoundException("File is not Process");
		 
		try {
			//compile Exception
				throw new FileNotFoundException("File is not Process");
		 }
		 catch(FileNotFoundException e) {
			 System.out.println("Some Thing Went Wrong");
		 }
	}

}
