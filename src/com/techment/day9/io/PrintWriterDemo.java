package com.techment.day9.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 •	By using FileWriter and BufferedWriter we can write only character data to the File 
    but by using PrintWriter we can write any type of data to the File.

 * 
 *
 */
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("E:\\JavaTraining\\Session\\src\\com\\techment\\day9\\io\\pqr.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);// converted in ascii form
		pw.println(100);// print 
		pw.println(true);
		pw.println('c');
		pw.println("Satyam");
		//pw.flush();
		pw.close();
/**
(pqr.txt)
d100
true
c
Satyam
 */

	}

}
