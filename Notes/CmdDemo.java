class CmdDemo{
    public static void main(String[] names){
      // String s1= args[0];
       //String s2= args[1];

      // use for each loop -> works with only arrays
      // System.out.println("Hello "+s1+" and "+s2);

     for(String name:names){
         System.out.println(name);
     }
      System.out.println("Total: "+names.length);
    }
}