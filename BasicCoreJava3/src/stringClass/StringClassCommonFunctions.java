package stringClass;

public class StringClassCommonFunctions {

	public static void main(String[] args) {
		
		String name=" Anand ";
		System.out.println(name);
		
		//Function 1 - Length
		System.out.println(name.length());
		
		//Function 2 - Trim
		System.out.println(name.trim().length());
		
		//Function 3 - CharAt
		System.out.println(name.charAt(0));
		
		//Function 4 - toUpperCase
		System.out.println(name.toUpperCase());
		
		//Function 5 - toLowerCase
		System.out.println(name.toLowerCase());
		
		//Function 6 - substring
		System.out.println(name.substring(1));
		
		//Function 7 - substring
		System.out.println(name.substring(1, 6));
		
		//Function 8 - Replace
		System.out.println(name.replace("n", "ab"));
		
		//Function 9 - Split
		String[] arr=name.split("n");
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		//Function 10 - 
		System.out.println(name.equals("anand"));
		
		System.out.println(name.equalsIgnoreCase("anand"));

		
		
	}
}
