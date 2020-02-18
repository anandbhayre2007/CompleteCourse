package constructor;

public class User {

	public static void main(String[] args) {
		
		Car car1= new Car();		
		car1.brand="Maruti";
		car1.color="White";
		car1.type="Petrol";
		Car.wheels=6;
		car1.features();
		
		Car car2= new Car();
		car2.brand="Mercedes";
		car2.color="Black";
		car2.type="Petrol";
		Car.wheels=4;
		car2.features();
		
		Car car3= new Car();
		car3.brand="Tesla";
		car3.color="Golden";
		car3.type="Electric";
		Car.wheels=6;
		car3.features();
		

	}

}
