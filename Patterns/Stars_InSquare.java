package Patterns;

import java.util.Scanner;

public class Stars_InSquare {
	
	Scanner sc=new Scanner(System.in);
	
	public void square(int num)
	{
		for(int row=0;row<num;row++)			//star in square's 
		{
			for(int col=0;col<num;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("Enter row length: ");
		int num1=sc.nextInt();
		System.out.println("Enter column length: ");
		int num2=sc.nextInt();
		
		for(int row=0;row<num1;row++)			// outer square in stars
		{
			for(int col=0;col<num2;col++)
			{
				if(row==0 || col==0 || row== num1-1|| col==num2-1 )
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("Enter row length: ");
		int rowLength=sc.nextInt();
		System.out.println("Enter column length: ");
		int colLength=sc.nextInt();
		for(int row=0;row<rowLength;row++)			// o in stars
		{
			for(int col=0;col<colLength;col++)
			{
				if(row==0 && col==0 || row==0 && col==num-1)
					System.out.print("  ");
				else if(row==num-1 && col==0 || row==num-1 && col==num-1)
					System.out.print("  ");
				else if(row==0 || col==0 || row== num-1|| col==num-1 )
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for(int row=1;row<=rowLength;row++)			// x in stars
		{
			for(int col=1;col<=colLength;col++)
			{
				if(col==row)
					System.out.print("*");
				else if(col==colLength-row+1 )
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stars_InSquare obj=new Stars_InSquare();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows and columns: ");
		int number=s.nextInt();
		obj.square(number);
	}
}
