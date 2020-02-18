package arrays;

public class Assignment1 {

	public static void main(String[] args) {
	
		int[] arr= {10,20,30,40,50,60,70,80,90,100};		
		boolean flag=false;		
		for(int s:arr)
		{
			if(s==40)
			{
				flag=true;
				//break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("40 is present in to the array");
		}else {
			System.out.println("40 is not present in to the array");
		}

	}

}
