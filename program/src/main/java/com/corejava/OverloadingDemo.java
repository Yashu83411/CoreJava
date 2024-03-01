package com.corejava;

public class OverloadingDemo {
	void add (int a, int b) {
		System.out.println("sum ="+(a+b));
	}
	void add (int a, int b, int c) {
		System.out.println("sum ="+(a+b+c));
	}
	void add (int a, float b) {
		System.out.println("sum ="+(a+b));
	}
	void add (float a, int b) {
		System.out.println("sum ="+(a+b));
	}
	public static void main(String[] args) {
		OverloadingDemo OD = new OverloadingDemo();
		OD.add(6, 8);
		OD.add(5, 9, 8);
		OD.add(9, 5.2f);
		OD.add(6.0f, 9);
}
}
