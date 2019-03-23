import java.util.ArrayList;

public class BankAccount {

	// data members
	private Person owner;
	private double balance;
	// list of transactions
	private ArrayList<Transaction> transactions;
	
	// note: address is part of Person

	// constructors
	public BankAccount() {
		// be sure to instantiate all sub-objects / data member objects
		this.owner = new Person();
		this.setTransactions(new ArrayList<Transaction>());
		
	}
	
	// get / set
	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	// member methods
	
}
