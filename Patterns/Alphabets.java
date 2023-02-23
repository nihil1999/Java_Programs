/**
 * 
 */
package Patterns;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Alphabets {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	
	public void toPrintAlphabets()
	{
//		System.out.println("Enter row limit:");
//		int row=sc.nextInt();
//		System.out.println("Enter column limit:");
//		int col=sc.nextInt();
		
		int row=5;		//A
		int col=10;
		
		int row_middle=row/2;
		int col_middle=col/2;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==col_middle-i || j==col_middle+i)
					System.out.print("*");
				else if(i==row_middle && j>=col_middle-i && j<=col_middle+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();		//B
		 row=7;
		 col=5;
		
		 row_middle=row/2;
		 col_middle=col/2;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0 || i==row_middle)
					System.out.print("* ");
				else if(i==0 && j!=col-1 || i==row-1 && j!=col-1)
					System.out.print("* ");
				else if(i!=0 && i!=row-1 && j==col-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();		//C
		 row=7;
		 col=5;
		
		 row_middle=row/2;
		 col_middle=col/2;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 && j!=0 || i==row-1 && j!=0 )
					System.out.print("* ");
				else if(i!=0 && j==0 && i!=row-1 && j==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();		//D
		 row=7;
		 col=5;
		
		 row_middle=row/2;
		 col_middle=col/2;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0)
					System.out.print("* ");
				else if(i==0 && j!=col-1 || i==row-1 && j!=col-1)
					System.out.print("* ");
				else if(i!=0 && i!=row-1 && j==col-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();		//E
		 row=7;
		 col=5;
		
		 row_middle=row/2;
		 col_middle=col/2;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0 || i==0 || i==row-1 || i==row_middle)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();		//F
		 row=7;
		 col=5;
		
		 row_middle=row/2;
		 col_middle=col/2;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0 || i==0 || i==row_middle)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Alphabets obj=new Alphabets();
			obj.toPrintAlphabets();
	}

}
