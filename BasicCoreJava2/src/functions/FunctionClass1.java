package functions;

public class FunctionClass1 {

	
	
	
	public static void main(String[] args) {
		
		sum();
		sum(10,20);
		sum(20,30);
		sum(30,40);
		sum(10,20,30);
		
		String[] arr=FunctionWithDifferentReturnType.getNames();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println(FunctionWithDifferentReturnType.stds);
	}
	
	public static void sum()
	{
		int a=10;
		int b=20;		
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
}
