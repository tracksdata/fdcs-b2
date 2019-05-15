class Person{
    
}
class Employee{

    int empId;
    static String companyName="CTS";
    public static void main(String[] abc){
    
    //int x=100;
   Employee e1= new Employee();
   Employee e2= new Employee();
   Employee e3= new Employee();

   e1.empId=10;
   e2.empId=20;
   e3.empId=30;

   Employee.companyName="Cognizant Technologies";
   Employee.companyName="Cognizant";

   System.out.println("E1: "+e1.empId);
   System.out.println("E2: "+e2.empId);
   System.out.println("E3: "+e3.empId);

    System.out.println("---------------------");
    
     System.out.println("E1: Company Name: "+Employee.companyName);
    System.out.println("E2: Company Name: "+companyName);
     System.out.println("E3: Company Name: "+companyName);
     System.out.println("Y: "+Test.y);
    
    }

}