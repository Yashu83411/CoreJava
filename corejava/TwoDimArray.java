package com.corejava;

public class TwoDimArray {
	public static void main(String[] args) {
		int rows = 5;
		int colums = 5;
		int[][] array = new int[rows][colums];
		int values = 4;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				array[i][j] = values;
				values++;
			}
		}
		System.out.println("The Two Dimensional array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
