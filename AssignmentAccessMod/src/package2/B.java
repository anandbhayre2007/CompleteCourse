package package2;

import package1.A;

public class B extends A{

	public static void main(String[] args) {
		
		/*System.out.println(A.b);
		
		A obj=new A();		
		System.out.println(obj.a);
		
		B obj2= new B();
		System.out.println(obj2.c);	*/	
		//System.out.println(A.b);
		B obj2= new B();
		System.out.println(obj2.c);				
		System.out.println(obj2.a);
		
		B obj3= new B(50,60);
		System.out.println(obj3.c);				
		System.out.println(obj3.a);
		
	}
	public B()
	{
		
	}
	
	public B(int a1,int c)
	{
		this.a=a1;
		this.c=c;
	}
}
