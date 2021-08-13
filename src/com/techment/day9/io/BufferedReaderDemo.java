package com.techment.day9.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * { BufferedReader}
 * 1)It read the content of file in our console
 * 2)
 *
 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{

		FileReader fr=new FileReader("E:\\JavaTraining\\Session\\src\\com\\techment\\day9\\io\\xyz.txt");
		BufferedReader br=new BufferedReader(fr);		
//		BufferedReader br=new BufferedReader(new FileReader("E:\\JavaTraining\\Session\\src\\com\\techment\\day9\\io\\xyz.txt"));
		
		System.out.println("read() : "+br.read());
		System.out.println("read() : "+br.read());
		System.out.println("read() : "+br.read());
		/**
(xyz.txt)
dabcd%Satyam
Software Developer Techment
		 */
		String line=br.readLine();    //
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		}

	}

