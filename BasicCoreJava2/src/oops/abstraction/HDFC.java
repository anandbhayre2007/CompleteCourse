package oops.abstraction;

public class HDFC implements RBI{
	
	public HDFC()
	{
		System.out.println("Welcome to HDFC");
	}

	@Override
	public void savingAccount() {
		System.out.println("Saving account from HDFC");
	}

	@Override
	public void currentAccount() {
		System.out.println("Current Account from HDFC");
	}

	@Override
	public void debitCard() {
		System.out.println("Debit Card from HDFC");
	}

	@Override
	public void creditCard() {
		System.out.println("Credit Card from HDFC");
	}

}
