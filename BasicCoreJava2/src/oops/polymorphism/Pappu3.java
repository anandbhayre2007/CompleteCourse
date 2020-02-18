package oops.polymorphism;

public class Pappu3 {

	public static void main(String[] args) {
		
		Telephone phone=new Smartphone();		
		//phone.calling();

		phone=new Mobile();
		phone.calling();
	}

}
