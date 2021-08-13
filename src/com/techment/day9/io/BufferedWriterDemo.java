package com.techment.day9.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * { BufferedWriter}
 * 1) we can write data line by line
 * 2) 
 *
 */
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException{

		FileWriter fw=new FileWriter("E:\\JavaTraining\\Session\\src\\com\\techment\\day9\\io\\xyz.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(100);
		bw.newLine();
		char[] ch={'a','b','c','d'};
		bw.write(ch);
		bw.write('%');
		//bw.newLine();
		bw.write("Satyam");
		bw.newLine();
		bw.write("Software Deviloper Techment");
		bw.flush();               //clear the stream of any element that may be or maybe not inside the stream
		bw.close();


	}

}
