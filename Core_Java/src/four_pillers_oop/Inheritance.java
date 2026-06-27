package four_pillers_oop;

class Animal{
	String name="";
	void displayAnimal() {
		System.out.println("Animal:"+name);
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Bow! Bow! Bow!");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("Meow! meow! meow!");
	}
}

class Horse extends Animal{
	void sound() {
		System.out.println("Eeh eeh eeh!");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		d.name="Charlie";
		d.displayAnimal();
		d.sound();
		
		Cat c=new Cat();
		c.name="Pussy";
		c.displayAnimal();
		c.sound();
		
		Horse h=new Horse();
		h.name="Randi";
		h.displayAnimal();
		h.sound();
	}

}
