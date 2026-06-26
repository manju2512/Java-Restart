package oops;

class Student {
	
	String name;
	int age;
	
	Student(){		
	}
	
	Student(String name){
		this.name=name;
	}
	
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}

	void DisplayStudent() {
		System.out.println("-->Name:"+name+" -->Age:"+age);
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		Student s2=new Student("Manju");
		Student s3=new Student("Manju",22);
		
		s1.DisplayStudent();
		s2.DisplayStudent();
		s3.DisplayStudent();
		
		Student s=new Student("Naveen",20);
		s.DisplayStudent();
		
	}

}
