package Player;

public class Account{
	private int balance;
	
	Account(int balance){
		this.balance = balance;
	}
	
	public int getMoney(){
		return this.balance;
	}
	public Account setMoney(int value){
		this.balance = value;
		return this;
	}
	public void addMoney(int value){
		this.balance += value;
	}
	public boolean takeMoney(int value){
		if (value>balance){
			this.balance = 0;
			return false;
		}
		else{
			this.balance -= value;
			return true;
		}
	}
}