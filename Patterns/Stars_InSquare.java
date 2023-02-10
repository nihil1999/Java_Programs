package Patterns;

import java.util.Scanner;

public class Stars_InSquare {
	
	public void square(int num)
	{
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				System.out.print("* ");
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
