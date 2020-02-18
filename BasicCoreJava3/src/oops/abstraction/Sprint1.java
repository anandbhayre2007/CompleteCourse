package oops.abstraction;

public abstract class Sprint1 extends MSWord{

	@Override
	public void save() {
		System.out.println("Save feature");
	}

	@Override
	public void edit() {
		System.out.println("Edit feature");
	}

	@Override
	public void open() {
		System.out.println("Open feature");
	}

}
