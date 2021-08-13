package com.techment.day9.io;
import java.io.File;
import java.io.IOException;
public class FileCreateDemo {

	public static void main(String[] args) throws IOException{
	
		//File file=new File("E:\\JavaTraining\\Session\\src\\com\\techment\\day9\\io\\abc.txt");
		
		File file=new File("E:\\JavaTraining\\Session\\src\\com\\techment\\day9\\io\\exam");
		System.out.println(file.exists());
		
		//file.createNewFile();        //create file    //checked Exception
		file.mkdir();                  //create folder
		System.out.println(file.exists());
		
		
	}
}
