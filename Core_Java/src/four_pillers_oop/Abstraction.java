package four_pillers_oop;

abstract class Car{
	abstract void displayFeatures();
	abstract void airBags();
	abstract void stepney();
	
	void music() {
		System.out.println("Playing Music!");
	}
}

abstract class InnovaVersion1 extends Car{
	void airBags() {
		System.out.println("With 6 AirBags!");
	}
}

abstract class InnovaVersion2 extends InnovaVersion1{
	void stepney() {
		System.out.println("Available with a stepney!");
	}
}

class Innova extends InnovaVersion2{
	void displayFeatures() {
		stepney();
		airBags();
		music();
	}
}


public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Innova().displayFeatures();
		//multi level Inheritance-->A child class is inheriting from a parent class,
		//which is a child from another class
	}

}
