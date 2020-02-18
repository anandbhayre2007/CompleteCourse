package arrays;

public class Array {

	public static void main(String[] args) {		
				
		String[] std=new String[11];		
		System.out.println(std.length);
		
		std[0]="Shweta";
		std[1]="Ashrita";
		std[2]="Rajashree";
		std[3]="Amrita";
		std[4]="Nikhil";
		std[5]="Durga";
		std[6]="Pratibha";
		std[7]="Shivaji";
		std[8]="Hari";
		std[9]="Sonali";
		std[10]="Nisha";
				
		/*
		for(int i=std.length-1; i>=0; i--)
		{
			System.out.println(std[i]);
		}*/
		
		
		for(String s:std)
		{
			System.out.println(s);
		}

	}

}
