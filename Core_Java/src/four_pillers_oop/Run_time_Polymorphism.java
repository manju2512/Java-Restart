package four_pillers_oop;

class Parent{
	void show() {
	System.out.println("Inside the Parent class:");
	}
}

class Child extends Parent{
	
	@Override
	void show() {
	System.out.println("Inside the child class:");
	}
}

public class Run_time_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent c=new Child();
		c.show();
	}

}
