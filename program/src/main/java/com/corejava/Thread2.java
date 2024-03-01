package com.corejava;

public class Thread2 implements Runnable {
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		Thread obj1 = new Thread(t1);
			obj1.start();
		Thread2 t2 = new Thread2();
		Thread obj2 = new Thread(t2);
			obj2.start();
			
	}
}



