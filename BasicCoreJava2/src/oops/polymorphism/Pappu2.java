package oops.polymorphism;

public class Pappu2 {

	public static void main(String[] args) {
		
		Telephone phone= new Smartphone();
		phone.calling();
		
		phone=new  Mobile();
		phone.calling();
		
		phone=new Telephone();
		phone.calling();		
	}

}
