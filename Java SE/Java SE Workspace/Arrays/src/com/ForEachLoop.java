package com;

public class ForEachLoop {

	public static void main(String[] args) {

		int nos[] = { 87, 43, 53, 34, 42 };
		
		for(int i=0;i<nos.length;i++)
			System.out.println(nos[i]);
		
		System.out.println("------------------");
		
		for(int i=nos.length-1;i>=0;i--) {
			System.out.println(nos[i]);
		}
		
	 
		
		
		System.out.println("--------------------");
		
		for(int no:nos) {
			System.out.println(no);
		}
		
		
		int marks[][]= {{10,20,30},{140,240,340},{54,60,87}};
		
		for(int[] rows:marks) {
			
			for(int mark:rows) {
				System.out.print(mark+"   ");
			}
			System.out.println();
			
		}
		
		
		

	}

}
