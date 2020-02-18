package constructor;

public class Car {
	
	String color="";
	String brand;
	String type;	
	static int wheels=4;
	
	public void features()
	{
		System.out.println("I purchased "+color+" "+brand+" Car which has "+type+" engine and has "+wheels+" wheels");
		
	}
	
	//Default constructor
	public Car()
	{
		
	}	
	
	//Parameterized Constructor
	public Car(String color,	String brand,	String type)
	{
		this.color=color;
		this.brand=brand;
		this.type=type;
	}

	public void accelarate(int speed)
	{
		System.out.println("My car can accelarate till "+speed+" kmph");
	}
}
