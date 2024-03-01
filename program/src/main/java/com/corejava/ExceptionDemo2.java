package com.corejava;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
			System.out.println("hello");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
