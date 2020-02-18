package oops.abstraction;

public class SBI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("Saving account from SBI");
	}

	@Override
	public void currentAccount() {
		System.out.println("Current Account from SBI");
	}

	@Override
	public void debitCard() {
		System.out.println("Debit Card from SBI");
	}

	@Override
	public void creditCard() {
		System.out.println("Credit Card from SBI");
	}

}
