package arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		String[][] arr= new String[3][];
		
		//Row 1
		arr[0]=new String[3];
		
		//Row 2
		arr[1]=new String[2];
		
		//Row 3
		arr[2]=new String[1];
		
		//Row 1
		arr[0][0]="U1";
		arr[0][1]="P1";
		arr[0][2]="A1";		
		
		//Row 2
		arr[1][0]="U2";
		arr[1][1]="P2";
				
		//Row 3
		arr[2][0]="U3";		
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length; c++)
			{
				System.out.println(arr[r][c]);
			}
		}

	}

}
