package basics;

public class Control_flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// If-else
		int marks=93;
		if(marks>90)
			System.out.println("Outstanding");
		else if(marks>80)
			System.out.println("very good");
		else if(marks>70)
			System.out.println("Good");
		
		//Switch
		int input=1;
		switch(input) {
		case 1:System.out.println("input 1");
		break;
		
		case 2:System.out.println("input 2");
		break;
		
		default:System.out.println("Default case in switch");
		
		}

	}

}
