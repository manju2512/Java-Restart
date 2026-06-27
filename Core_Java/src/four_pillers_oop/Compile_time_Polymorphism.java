package four_pillers_oop;

public class Compile_time_Polymorphism {

	void m(int a) {
		System.out.println(a);
	}
	void m(int a,int b) {
		System.out.println(a+","+b);
	}
	void m(double a, double b) {
		System.out.println(a+","+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compile_time_Polymorphism c=new Compile_time_Polymorphism();
		c.m(10);
		c.m(10,20);
		c.m(10.0,20.0);
	}

}
