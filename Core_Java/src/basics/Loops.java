package basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loop
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
		
		//while loop
		System.out.println();
		int a=10;
		while(a>0) {
			System.out.print(a+" ");
			a--;
		}
		
		//Do-while
		System.out.println();
		a=10;
		do {
			System.out.print(a+" ");
			a--;
		}while(a>0);
		
		//for-each
		System.out.println();
		int b[]= {1,2,3,4,5};
		for(int i:b) {
			if(i==2)
				continue;
			System.out.print(i+" ");
		}
		
		//Break and continue
		//break- works in for,for-each, while, do-while loops and switch statements
		//continue- works only in for,for-each, while, do-while loops but not in switch statements
	}

}
