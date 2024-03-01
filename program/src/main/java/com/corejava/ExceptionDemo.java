package com.corejava;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a[] = {9,8,7,6,5};
		try {
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
	}
}
