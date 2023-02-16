package Patterns;

import java.util.Scanner;

public class Triangle {
	
	public void rightAngle_Triangle(int num)
	{
//		for(int row=0;row<num;row++)
//		{
//			for(int col=0;col<num;col++)
//			{
//				if(col<num-row-1)
//					System.out.print("  ");
//				else
//					System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		for(int row=1;row<=num;row++)
		{
			for(int space=1;space<=num-row;space++)
			{
					System.out.print("  ");
			}
			
			for(int col=1;col<=row;col++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int row=1;row<=num;row++)
		{
			for(int space=num-row;space>=1;space--)
			{
					System.out.print("  ");
			}
			
			for(int col=1;col<=row;col++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void centre_Triangle(int num1,int num2)
	{
//	    int num=(num2/2);
//	    System.out.println(num);
//		for(int row=0;row<num1;row++)
//		{
//			for(int col=0;col<num2;col++)
//				{
//				if(col==num+row || col==num-row )//|| row==num1-1)
//				{	System.out.print((row+1)*3 + " ");
//				//System.out.print("* ");
//				}
//				else 
//					System.out.print("  ");
//				}
//			System.out.println();		
//			}
		

//center triangle.
		int mid=num2/2;
		for(int row=0;row<num1;row++)
		{
			for(int col=0;col<num2;col++)
			{
				if(col%2==0 && row%2==0) {
					if(col>=mid-row && col<=mid+row)
					System.out.print("* ");
					else
						System.out.print("  ");
						}
				else if(col%2!=0 && row%2!=0) {
					if(col>=mid-row && col<=mid+row)
					System.out.print("* ");
					else
						System.out.print("  ");
					}
				else
					System.out.print("  ");
			}
			System.out.println("\n");
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Triangle obj=new  Triangle();
		 Scanner s=new Scanner(System.in);
		// System.out.println("Enter the no of rows: ");
		// int number=s.nextInt();
		// obj.rightAngle_Triangle(number);
		 System.out.println("Enter the no of columns: ");
		 int num1=s.nextInt();
		 int num2=s.nextInt();
		 obj.centre_Triangle(num1,num2);
	}

}
