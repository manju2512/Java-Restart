package exceptional_handling;
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		System.out.println(a);
		try {
			a=(10/0);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException"+e);
		}finally {
			System.out.println("The finally block will execute no matter what");
		}
		System.out.println(a);
	}
}
