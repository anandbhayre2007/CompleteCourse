package arrays;

public class DifferentDataTypes {

	public static void main(String[] args) {
		
		Object[] obj= new Object[3];
		obj[0]=10;
		obj[1]=true;
		obj[2]="anand";
		
		for(Object o:obj)
		{
			System.out.println(o);
		}

	}

}
