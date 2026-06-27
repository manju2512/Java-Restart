package four_pillers_oop;

public class Up_Down_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal d=new Dog();//upcasting
		d.name="newAnimal";
		d.displayAnimal();
		
		Dog da=(Dog)d; //Downcasting
		da.sound();
	}

}
