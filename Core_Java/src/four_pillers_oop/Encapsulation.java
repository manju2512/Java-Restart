package four_pillers_oop;

class Bank{
	private double balance;
	
	Bank(){
	}
	
	Bank(double balance){       //runs when the object is created using new keyword
		this.balance=balance; //Runs once per object
		System.out.println("Initial Balance: "+getBal()+" Rupees");
	}
	
	void setBal(double balance) {   //Can be run whenever by calling the method
		this.balance=balance;	//Can be ran multiple time based on the requirement
		System.out.println("Updates Balance: "+getBal()+" Rupees");
	}
	
	void Deposit(double amt) {
		if(amt>0) {
		balance+=amt;
		System.out.println("Your account has been credited with "+amt+" available balance is "+getBal()+" Rupees");
		}
	}
	
	void Withdraw(double amt) {
		if(amt>0) {
		balance-=amt;
		System.out.println("Your account has been debited with "+amt+" available balance is "+getBal()+" Rupees");
		}
	}
	
	double getBal() {
		return balance;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank(1000);
		b.setBal(2000);
		b.Deposit(3000);
		b.Withdraw(1500);
	}

}
