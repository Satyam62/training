package com.techment.day9.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr=new FileReader("abc.txt");
		int ch=fr.read();
		while(ch!=-1) {
			System.out.println(ch);
			ch=fr.read(); //increment		
			
		}
		
		
//		FileReader fr=new FileReader("abc.txt");
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		

	}

}
