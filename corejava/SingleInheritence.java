package com.corejava;

class A {
	void methodA() {
		System.out.println("method of class A");
	}
}

class B {
	void methodB() {
		System.out.println("method of class B");
	}
}

public class SingleInheritence {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		a.methodA();
		b.methodB();
	}
}
