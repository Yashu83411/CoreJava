package com.corejava;

class Yashu {
	public void displayInfo() {
		System.out.println("i am yashu");
	}
}

class Kaveri extends Yashu {
	public void displayInfo() {
		System.out.println("i am kaveri");
	}
}

public class Language {

	public static void main(String[] args) {
		Kaveri k = new Kaveri();
		k.displayInfo();
		Yashu y = new Yashu();
		y.displayInfo();
	}

}
