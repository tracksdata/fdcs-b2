package p2;

import p1.C1;

public class C2 extends C1 {
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		C2 c2=new C2();
		c2.f2(); // protected 
		c2.fun(); // public
		//c1.f1();
		c1.fun(); // public
		//c1.f1(); // protected  -> Invalid
		//c1.f2(); // protected  -> Invalid
		
		
		
		
		
	}

}
