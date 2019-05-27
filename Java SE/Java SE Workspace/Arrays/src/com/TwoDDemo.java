package com;

public class TwoDDemo {
	
	public static void main(String[] args) {
		
		int x[][]= { {10,20 ,76,43},{ 30,40,5,43},{1,2,3,4}};
		
		int[][] y=new int[3][3];
		
		//System.out.println(x[0][0]);
		//System.out.println(x[0][1]);
		//System.out.println(x[1][0]);
		//System.out.println(x[1][1]);
		
	//	System.out.println(x.length);
		// for loop
		
		for(int row=0;row<x.length;row++) {
			
			for(int col=0;col<x[row].length;col++) {
				System.out.print(x[row][col]+"  ");
			}
			
			System.out.println();
			
			
		}
		
	}

}
