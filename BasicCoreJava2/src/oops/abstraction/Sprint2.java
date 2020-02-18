package oops.abstraction;

public class Sprint2 extends Sprint1{

	@Override
	public void savAs() {
		System.out.println("SavAs feature");
	}

	@Override
	public void undo() {
		System.out.println("Undo feature");
	}

	@Override
	public void exit() {
		System.out.println("Edit feature");
	}

}
