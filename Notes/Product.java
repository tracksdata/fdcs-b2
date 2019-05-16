class Product{

  static Product prod=null;
    private Product(){
       
    }

    static Product out(){
         if(prod==null){
            prod=new Product();
        }
        return prod;
    }
    void display(){
        System.out.println("Product display method by "+this.hashCode());
    }
}