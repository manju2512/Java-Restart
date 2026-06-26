package basics;

public class Operators{
	 public static void main(String[] args) {
		System.out.println("addition:"+(10+20));
		System.out.println("Subtraction:"+(10-20));
		System.out.println("Multiplication:"+(10*20));
		System.out.println("Division:"+((float)10/20));
		System.out.println("Reminder:"+10/20);
		
		//comparison operators
		System.out.println(10==20);//false
		System.out.println(10>20);//false
		System.out.println(10<20);//true
		System.out.println(10!=20);//true
		System.out.println(10>=20);//false
		System.out.println(10<=20);//true
		
		//Logical Operators
		System.out.println("Logical operators:");
		//AND
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		
		//OR
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		//NOT
		System.out.println(!true);//false
		System.out.println(!false);//true
	}
	
}