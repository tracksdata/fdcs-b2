package com;

public class OneDArrays {
	
	

	public static void main(String[] args) {
		
		// RUles for defining arrays
		
		/*
		 * 	-> Array size always positive integer
		 * 	-> Size can be a final variable or contemt of an integer value
		 */
		
		
		// No of ways defining array
		// 1. Without new operator
		
		//int i[]; // blank array
		int ii[]= {}; // blank with default array
		int[] iii;
		int []i4;
		ii=new int[100];
		//i=new int[3];
		//i= {87,44};
		
		
		
		//[]int i5; INvalid
		
		int[] i5= {12,43,56,65,5,4,3,4,5,5};
		
		// with new operator
		
		int[] i6=new int[5];
		int i7[]=new int[5];
		int []i8=new int[5];
		
		// Invalid
		//int x[5];
		//int[5] i9=new int[];
		//int[] i10=new int[];
		
		int s=10;
		int[] i9=new int[s];
		
		final int SIZE=100;
		
		int[] i10=new int[SIZE];
		
		
		
		int[] x=new int[5];
		x[0]=87;
		x[3]=56;
		x[2]=85;
		
		for(int i=0;i<x.length;i++) {
		
			System.out.println("X["+i+"]="+x[i]);
		}
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
