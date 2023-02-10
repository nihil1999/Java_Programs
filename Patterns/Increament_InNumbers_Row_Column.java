package Patterns;

import java.util.Scanner;

// print the numbers in row and column wise increment.
public class Increament_InNumbers_Row_Column {

//print the numbers incrementing in row wise. 
	public void row_wise_increment(int range)
	{
//Method 1:
		int count=1;
		for(int row=0;row<range;row++)
		{
			for(int col=0;col<range;col++)
			{
				System.out.print(count + " ");
				count++;
			}
		System.out.println();
		}
		
//Method 2:
//		for(int row=0;row<range;row++)
//			{
//				for(int col=1;col<=range;col++)
//				{
//					System.out.print((row*range+col) + " ");
//				}
//			System.out.println();
//			}
	}

//print the numbers incrementing in column wise. 
	public void column_wise_increment(int range)
	{

//Method 1:
		for(int row=1;row<=range;row++)
		{
			for(int col=0;col<range;col++)
			{
				System.out.print((col*range+row) + " ");
			}
		System.out.println();
		}
		
//Method 2:		
//		for(int row=1;row<=range;row++)
//		{
//			int count=row;
//			for(int col=1;col<=range;col++)
//			{
//				System.out.print(count + " ");
//				count+=range;
//			}
//		System.out.println();
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Increament_InNumbers_Row_Column obj=new Increament_InNumbers_Row_Column();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns: ");
		int range=s.nextInt();
		obj.row_wise_increment(range);
		System.out.println();
		obj.column_wise_increment(range);
		
		
		
	}

}
