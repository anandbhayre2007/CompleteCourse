package functions;

public class NonStaticFunctions 
{
	int age=31;	
	static int students=11;

	public static void main(String[] args) 
	{
		
		NonStaticFunctions ref= new NonStaticFunctions();
		ref.age=33;
		ref.students=12;
		System.out.println(ref.age);
		System.out.println(ref.students);
		
		//System.out.println(ref.sum(10, 20));
		
		NonStaticFunctions ref2= new NonStaticFunctions();
		System.out.println(ref2.age);
		System.out.println(ref2.students);

	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	

}
