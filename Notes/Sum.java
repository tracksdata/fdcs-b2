class Sum{

    public static void main(Integer[] args){
        System.out.println("---- my won method");
    }
    public static void main(String[] args){
    Integer[] x={1,2};
    main(x);
     float sum=0.0f;
     for(String data:args){
        float no= Float.parseFloat(data);
        sum=sum+no;
     }
     
     System.out.println("Sum: "+sum);

    // float res=(float)10/3;
     //System.out.println(res);

    }
}