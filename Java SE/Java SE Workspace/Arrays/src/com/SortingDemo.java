package com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortingDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("How many Elements: ");
		int size=sc.nextInt();
		int[] nos=new int[size];
		
		System.out.println("Enter "+size+" Elements");
		
		for(int i=0;i<size;i++) {
			nos[i]=sc.nextInt();
		}
		
		System.out.println("Elements of an Array");
		for(int i=0;i<nos.length;i++) {
			System.out.print(nos[i]+" ");
		}
		
		System.out.println();
		
		
		
		System.out.println("Sorting");
		
		
		
		Arrays.sort(nos);
		
		System.out.println("Elements of an Array");
		for(int i=0;i<nos.length;i++) {
			System.out.print(nos[i]+" ");
		}
		
		int pos=Arrays.binarySearch(nos, 23);
		System.out.println("Position: "+pos);
		
		
		
		
		
		
	}
	

}
