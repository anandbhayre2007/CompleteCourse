package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		RBI ref=null;
		
		String bankName="ICICI";
		
		if(bankName.equals("HDFC"))
		ref= new HDFC();
		else if(bankName.equals("SBI"))
		ref= new SBI();
		else if(bankName.equals("ICICI"))
		ref= new ICICI();
		
		
		ref.creditCard();
		ref.debitCard();
		ref.savingAccount();
		ref.currentAccount();
		
		ref.demonetization();
		SC.Constitution();
		
		

	}

}
