package com.corejava;

abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	abstract void makesound();

	public String getname() {
		return name;
	}

	 static class Dog extends Animal {
		public Dog(String name) {
			super(name);
		}

		public void makesound() {
			System.out.println(getname() + " braks");
		}
	}

	static class Cat extends Animal {
		public Cat(String name) {
			super(name);
		}

		public void makesound() {
			System.out.println(getname() + " mewos");
		}
	}

	public static void main(String[] args) {
		Animal myDog = new Dog("Toney" );
		Animal myCat = new Cat("Puppy");
		myDog.makesound();
		myCat.makesound();

	}
}
