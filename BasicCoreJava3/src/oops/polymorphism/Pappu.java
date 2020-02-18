package oops.polymorphism;

public class Pappu {

	public static void main(String[] args) {
		
		Object obj;
		obj=new Smartphone();
		obj=new Telephone();
		obj=new Mobile();
		
		

		
		Telephone phone2;
		phone2=new Telephone();
		phone2=new Smartphone();
		phone2=new Mobile();
		
		
		
		Mobile phone3;
		
		phone3=new Mobile();
		phone3=new Smartphone();
		
		Smartphone phone4;
		phone4=new Smartphone();
		
		
		
	}

}
