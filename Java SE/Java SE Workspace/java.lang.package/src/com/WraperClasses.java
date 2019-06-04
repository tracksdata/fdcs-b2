package com;

/*
 * 	Wrapper classes
 * ---------------------
 * 		Primitive		Wraper Type
 * 	----------------------------------
 * 			int			Integer
 * 			byte		Byte
 * 			short		Short
 * 			long		Long
 * 			float		Float
 * 			double		Double
 * 			char		Character
 * 			boolean		Boolean
 * 	----------------------------------
 * 
 * 		-> Boxing and Un-Boxing
 * 		-> Auto Casting 
 * 
 */
public class WraperClasses {

	public static void main(String[] args) {
		
	/*
		int x=100;
		Integer intObj=x;
		
		float f=733.34f;
		Float ff=733.34f;
		int ii=ff.intValue();
		
		long l=intObj.longValue();
		double d=intObj.doubleValue();
		
		
		String s1="1000";
		int n=Integer.parseInt(s1);
		float fff=Float.parseFloat(s1);
		double dd=Double.parseDouble(s1);
		
		Integer iValue=2434;
		
		
		*/
		
		
		Integer i=344;
		Integer intObj=new Integer(864); // Boxing
		int x=intObj.intValue(); // Un Boxing 
		
		System.out.println(Integer.toBinaryString(i));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
