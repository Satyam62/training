package com.techment.day9.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("E:\\JavaTraining\\Session\\src\\com\\techment\\day9\\io\\abc.txt");
		fw.write("Hello");
		fw.write(92);
		fw.write('c');
		fw.write("\n World \n");
		System.out.println("written Successfully"); //only showing in console
		fw.close();
		
	}

}
