package constructor;

public class User2 {

	public static void main(String[] args) {
		Car car1=new Car("White","Maruti","Petrol");
		car1.features();

		Car car2=new Car("Black","Honda","Diesel");
		car2.features();
		car2.accelarate(150);
		
		Car car3=new Car();
		car3.accelarate(250);
		
	}

}
