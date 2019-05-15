class Use{
    int age;

}
class Test{
/*
    1. properties/variables/fields
    2. methods
    3. constructors
    4. blocks

    1. properties/variables/fields
    ---------------------------------
        -> instance variables
            -> data is individual to specified object
        -> static variables
            -> data is available to all the object
     2. methods
        -> instance methods
            -> instance variable can be accessed directly 
             from the same class with out object
            -> instance variable can be accesss with help
            of an object, if data is there in another class
            -> static data and instance data can be accessed 
               directly from the same class
        -> static methods
            -> access static data from  the same class directly
             with out object
            -> access static data from ther class with class name
            -> will access only static data
            -> will not access non static data directly..


Data Types
-------------

Data Type           Size in Bytes       Wraper class
    int                 4               Integer
    short               2               Short
    byte                1               Byte
    long                8               Long
    -------------------------------------------------
    float               4               Float
    double              8               Double
    -----------------------------------------------   
    char                2               Character
    -------------------------------------------------
    boolean             ?               Boolean

 Q1: When object should be created?
    -> To Access non static data from a static method
    -> To access non sttaic data from non static method 
       of a differnt class.    


*/

int x; // class level variable -> instance variable
static int y=1000; //static variable

void f1(){ // non static method
System.out.println("--- f1 ");
y=7666;
x=988;
}

static void  f2(){// static method
//x=999; // Invalid
    System.out.println("--- f2 ");
}
public static void main(String[] abc){
int yyyy=87; // local variable
f2();
Test t=new Test();
t.f1();// Valid
    //int x=2147483647;
    //long y=9223372036854775807l;

   //System.out.println(Long.MAX_VALUE);
   //System.out.println(Long.SIZE);
    System.out.println(y);

}



}