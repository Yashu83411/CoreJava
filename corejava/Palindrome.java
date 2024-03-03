package com.corejava;

public class Palindrome {
	public static void main(String[] args) {
		int r;
		int sum = 0;
		int Temp = 0;
		int n = 858;
		Temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (Temp == sum)
			System.out.println("The number is palindrome");
		else {
			System.out.println("the number is not a palindrome");
		}
	}
}
