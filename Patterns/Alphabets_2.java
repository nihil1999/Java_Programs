/**
 * 
 */
package Patterns;

/**
 * @author logan
 *
 */
public class Alphabets_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=10;
		
		int row_middle=row/2;
		int col_middle=col/2;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 && j==col_middle)
					System.out.print("-");
				else if(j==col_middle-i)
					System.out.print("/");
				else if(j==col_middle+i)
					System.out.print("\\");
				else if(i==row_middle && j>=col_middle-i && j<=col_middle+i)
					System.out.print("_");
				else
					System.out.print(" ");
			}
			System.out.println();
		
	}

}
}
