package projects;

public class Conta {

	private int account;
	private String holder;
	private double balance;
	
	public Conta(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}
	
	public Conta(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	

	public int getAccount() {
		return account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5;
	}
	
	public String toString() {
		return "Account " + account + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
