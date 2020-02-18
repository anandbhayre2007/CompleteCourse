package conditionalStatements;

public class NestedIF {

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		int c=40;
		
		if(a>b)
		{
			if(b>c)
			{
				System.out.println("a is greatest");
			}else if(a>c){
				System.out.println("a is greatest");
			}else {
				System.out.println("c is greatest");
			}
		}else if(b>c)
		{
			System.out.println("b is greatest");
			
		}else {
			System.out.println("C is greatest");
		}

	}

}
