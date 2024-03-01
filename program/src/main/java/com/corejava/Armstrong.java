package com.corejava;

public class Armstrong {
	public static void main(String[] args) {
		int num = 423;
		int OriginalNumber = 0;
		int Remainder = 0;
		int res = 0;

		OriginalNumber = num;
		while (OriginalNumber != 0) {
			Remainder = OriginalNumber % 10;
			res += Math.pow(Remainder, 3);
			OriginalNumber /= 10;
		}
		if (res == num) {
			System.out.println(num + " is an Armstrong Number");
		} else {
			System.out.println(num + "is not an Armstrong Number");
		}
	}
}
