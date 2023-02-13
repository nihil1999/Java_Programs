package Patterns;

import java.util.Scanner;

public class Numbers_Insquare {
	
	public void square(int num)
	{
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				System.out.print(row+1 +" ");
			}
			System.out.println();
		}
		

		System.out.println("\n");
		
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				System.out.print(num-col +" ");
			}
			System.out.println();
		}
		
System.out.println("\n");
		
		int count=1; 
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		int count1=1; 
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				System.out.print(count1 +" ");
				count1+=2;
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int row=0;row<num;row++)
		{
			for(int col=0;col<num;col++)
			{
				System.out.print(((row+1)*(col+1)) +" ");
			}
			System.out.println();
		}
		
System.out.println("\n");
		
		for(int row=0;row<num;row++)
		{
			int n=1;
			for(int col=0;col<num;col++)
			{
				if(col%2==0)
					System.out.print(n++ +" ");
				else
					System.out.print(row+1 +" ");
			}
			System.out.println();
		}
		
System.out.println("\n");
		
		for(int row=0;row<num;row++)
		{
			int n=1;
			for(int col=0;col<num;col++)
			{
				if(col%2!=0)
					System.out.print(n++ +" ");
				else
					System.out.print(row+1 +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers_Insquare obj=new Numbers_Insquare();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows and columns: ");
		int number=s.nextInt();
		obj.square(number);
		

}
}
