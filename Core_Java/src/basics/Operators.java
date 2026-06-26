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
		
		//Assignment Operators
		System.out.println("Assignment Operators:");
		
		int a=10;//Assignment
		
		a+=5; //Shortcut for addition adds 5 to a and assigns back to a
		a-=5; //subtraction
		a*=5; //multiplication
		a/=5; //Division
		
		//Increment and Decrement
		//Increment
		//Pre-increment
		int b=10;
		System.out.println(++b);//11 and b=11
		System.out.println(b);
		
		//Post-increment
		b=10;
		System.out.println(b++);//10 but b=10
		System.out.println(b);
		
		//Decrement
		//Pre-decrement
		b=10;
		System.out.println(--b);//9 and b=9
		System.out.println(b);
		
		//Post-decrement
		b=10;
		System.out.println(b--);//10 but b=9
		System.out.println(b);
		
		
	}
	
}