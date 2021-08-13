package com.techment.collectionAssignemet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of Students : ");
		int NumberStudent=scanner.nextInt();
		int n,s=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Ener Marks : ");
		for(int i=0;i<NumberStudent;i++) {
			n=scanner.nextInt();
			al.add(n);
			s=s+al.get(i);
		}
		System.out.print("Marks : ");
		for(int i=0;i<NumberStudent;i++) {
		
			System.out.print((i+1)+ " - "+al.get(i)+"  ");
		}
		Collections.sort(al);
		System.out.println("\nHeighest Marks : "+ al.get(NumberStudent-1));
		System.out.println("Average Marks : "+ (s/NumberStudent));
		
		System.out.println("Enter nth Student Marks ");
		n=scanner.nextInt();
		System.out.print(al.get(n)+"\nSorted Marks : ");
		for(int i=0;i<NumberStudent;i++) {
			System.out.print((i+1)+ " - "+al.get(i)+"  ");
		}
	}

}
/**

1 – Student Marks
Create a Class StudentMarks with a main method. Use Scanner to accept marks scored by Students.

Add the marks to an ArrayList. (two or more students can have the same marks)
Display the highest mark scored by the student.
Display the Average marks scored by the Students
Display the marks stored by the 3rd Student
Sort the marks and display the marks using Iterator.

Sample Input
Enter number of Students
4
Enter Marks
40 60 60 50 

Sample Output
Highest Marks : 60
Average Marks : 52.5
Marks 	: 1-40 2-60 3-60 4-50
3rd Student marks : 60
Sorted 	: 1-40 2-50 3-60 4-60
*/