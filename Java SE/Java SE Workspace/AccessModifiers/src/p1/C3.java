package p1;

public class C3 {

	public static void main(String[] args) {

		C1 c1 = new C1();

		c1.f1(); // default
		c1.f2(); // protected
		c1.fun(); // public
		// c1.f3(); // private -> Invalid

	}

}
