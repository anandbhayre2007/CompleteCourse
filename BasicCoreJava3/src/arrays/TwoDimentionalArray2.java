package arrays;

public class TwoDimentionalArray2 {

	public static void main(String[] args) {
		
		String[][] data=new String[2][4];
		
		//Row 1
		data[0][0]="Anand";
		data[0][1]="Bhayre";
		data[0][2]="Wagholi";
		data[0][3]="Techbodhi";
		
		//Row 2
		data[1][0]="Nikhil";
		data[1][1]="Ghatge";
		data[1][2]="Wagholi";
		data[1][3]="Techbodhi";
		
		for(int row=0; row<data.length; row++)
		{
			for(int col=0; col<data[row].length; col++)
			{
				System.out.println(data[row][col]);
			}
			
		}
		
		System.out.println(data.length);
		System.out.println(data[0].length);

	}

}
