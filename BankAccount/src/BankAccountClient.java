
public class BankAccountClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount myBankAccount = new BankAccount();
		
		// crash! BankAccount's Person not instantiated
		// System.out.println("myBankAccount.getOwner(): " + 
		// 		myBankAccount.getOwner());
		
		
		// set BankAccount's Owner's Address's streetAddress
		myBankAccount.getOwner().getAddress().setStreetAddress("123 Main Street");
		
		// display BankAccount's Owner's Address's streetAddress
		System.out.println(myBankAccount.getOwner().getAddress().getStreetAddress());
	}

}
