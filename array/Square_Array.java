package array;

import java.util.Scanner;

public class Square_Array {
	
	public void squareTheArray()
	{
		System.out.println("Enter the range: ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int a[]=new int[range];
		int b[]=new int[range];
		
		for(int i=0;i<range;i++)
		{
			System.out.println("Enter the value for "+i+" index");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<range;i++)
		{
			b[i]=a[i]*a[i];
		}
		
		display(a,b);
		sc.close();
	}

	public void display(int[] a, int[] b) {
		// TODO Auto-generated method stub
		System.out.println("1st Array values");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nSquare of 1st array values. ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square_Array obj=new Square_Array();
		obj.squareTheArray();
		 
	}

}
