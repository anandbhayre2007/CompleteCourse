package oops.abstraction;

public class ICICI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("Saving account from ICICI");
	}

	@Override
	public void currentAccount() {
		System.out.println("Current Account from ICICI");
	}

	@Override
	public void debitCard() {
		System.out.println("Debit Card from ICICI");
	}

	@Override
	public void creditCard() {
		System.out.println("Credit Card from ICICI");
		SC.Constitution();
	}

	
}
