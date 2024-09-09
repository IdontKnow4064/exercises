package entities;

public class entities {
		
	private int number;
	private String holder;
	private double balance;
	
	public int getNumber() {
		return number;
		
	
	}public void setNumber(int number) {
		this.number = number;
	}
		
	public String getHolder() {
		return holder;
	}public void setHolder(String holder) {
		this.holder = holder;
	}public double getBalance() {
		return balance;
		
	}public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	
}
