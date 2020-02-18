package functions;

public class FunctionWithDifferentReturnType {
	
	

	public static void main(String[] args) {
		
		System.out.println(stds);
		/*int temp=0;
		System.out.println(temp);
		temp=sum(10,20);
		System.out.println(temp);
		
		int temp1=0;
		System.out.println(temp1);
		temp1=sum(40,50);
		System.out.println(temp1);
		
		System.out.println(temp+temp1);*/
		
		
		/*int temp=sum(10,20);		
		int temp1=sum(40,50);		
		
		System.out.println(temp+temp1);*/
		
		
		System.out.println(sum(10,20)+sum(40,50));
		System.out.println(message("Nikhil"));
		System.out.println(message("Nikhil",23));
		System.out.println(message("Nikhil",23,false));
		
		
		String[] arr=getNames();
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public static int sum(int x, int y)
	{
		//return x+y;	
		
		if(x>y)
		{
			return x+y;
		}else {
			return x+y+10;
		}
		
	}

	
	public static String message(String name)
	{
		return "Your name is "+name;
	}
	
	public static String message(String name, int age)
	{
		return "Your name is "+name+" and your age is "+age;
	}
	
	public static String message(String name, int age, boolean marritalStatus)
	{
		if(marritalStatus==true)
		{
		
			return "Your name is "+name+" and your age is "+age+" and you are married";
		}else {
			
			return "Your name is "+name+" and your age is "+age+" and you are unmarried";
		}
	}
	
	public static String[] getNames()
	{
		String[] str=new String[2];
		str[0]="Shweta";
		str[1]="Anand";
		
		return str;
	}
	
	int age=31;
	static int stds=11;
}
