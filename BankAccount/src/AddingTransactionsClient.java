
public class AddingTransactionsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount myBankAccount = new BankAccount();
		
		// add a transaction to myBankAccount
		myBankAccount.getTransactions().add(new Transaction());
		
		// set the amount for the first transaction
		myBankAccount.getTransactions().get(0).setAmount(12.34);
		
		// output value of first transaction
		double firstTransactionAmount = myBankAccount.getTransactions().get(0).getAmount();
		
		System.out.println("firstTransactionAmount: " + firstTransactionAmount);
	}

}
