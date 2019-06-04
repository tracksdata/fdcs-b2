package com;

/*
 * 		Notes
 * 	---------------
 * 	-> Heap is the dynamic memory which is having all the java objects
 * 	-> Assigning null value to a object is called un-referencing
 * 	-> GC invokes in a period span of time and scans the class, If any Object is 
 * 	   eligible for GC, then GC will removes those objects from heap.
 * 	
 */

class Person {
	int x;
	long l;
	double d;

	static int count = 1;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person class garbage collected " + count++);

	}

}

public class GarbageCollectionDemo {

	public static void main(String[] args) {

		/*
		 * Person p = new Person(); Person p1 = new Person(); p = null; p1 = null;
		 * 
		 * System.gc();
		 */
		
		Runtime rt=Runtime.getRuntime();

		System.out.println("Total Memory: "+rt.totalMemory());
		for (int i = 1; i <= 895000; i++) {
			Person p = new Person();
		}
		
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Used memory: "+(rt.totalMemory()-rt.freeMemory()));

		System.out.println("--- Done ---");

	}

}
