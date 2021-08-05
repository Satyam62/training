package com.techment.demo;

public class jaggedArray {

	public static void main(String[] args) {
		int a[][]=new int[4][];
		a[0]=new int[2];
		a[1]=new int[4];
		a[2]=new int[1];
		a[3]=new int[6];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===============================================================================================");
		int b[][]= {{1,2},{3,4,5,6},{7,8,9}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
