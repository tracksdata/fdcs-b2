//import java.io.PrintStream;
/*
1. System is a class belongs to java.lang package
2. All the classes defined uner lang package by default
   available to all the classes in java
3. out is static object whcich belongs to 
   java.io.PrintStream class
4. by calling System.out, java internally returns back
   PrintStream class object
5. on top of PrintStream class object, we can invoke
   any method on it.
*/

class Demo{

public static void main(String[] abc){

  // PrintStream ps= System.out;
   //ps.println("-- Hello ");
   // System.out.println("Welcome");

  // Product p=new Product();
   //p.display();
   //p.display();

   

  Product.out().display();
  Product.out().display();
  Product.out().display();
    //p1.display();
     //p2.display();
      //p3.display();

int i=03647357;
     // System.out.println(Math.ceil(45.7));
}


}