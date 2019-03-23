import java.util.Date;

public class Transaction {

	// data members
	private double amount;
	private Date dateOfTransaction;
	
	public Transaction() {
		dateOfTransaction = new Date();
	}
	
	// get / set
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	
}
