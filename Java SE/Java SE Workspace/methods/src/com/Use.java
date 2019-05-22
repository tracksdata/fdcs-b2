package com;

class Animal {

	public Animal() {
		System.out.println("--- Object created for Animal");
	}

	void f1() {
		System.out.println("Animal f1 method");
	}
}

public class Use {

	void display(Animal aa) {
		// Animal aa=new Animal();
		aa.f1();
	}

	public static void main(String[] args) {

		Animal a = new Animal();

		Use u = new Use();

		u.display(a);
		u.display(a);
		u.display(a);
		u.display(a);

	}

}
