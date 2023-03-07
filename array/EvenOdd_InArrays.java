package array;

import java.util.Scanner;

public class EvenOdd_InArrays {

	public void print_even(int[] range)
	{
		System.out.println("Even Numbers");
//method 1:with variable
		int num=2;
		for(int i=0;i<range.length;i++)
		{
			range[i]=num;
			System.out.print(range[i] + " ");
			num+=2;
		}
		System.out.println();

//method 2: without variable
		for(int i=0;i<range.length;i++)
		{
			range[i]=i*2+2;
			System.out.print(range[i] + " ");
		}
		System.out.println();
	}
	
	public void print_odd(int[] range)
	{
		System.out.println("Odd Numbers");
//method 1:with variable
		int num=1;
		for(int i=0;i<range.length;i++)
		{
			range[i]=num;
			System.out.print(range[i] + " ");
			num+=2;
		}
		System.out.println();

//method 2: without variable
		for(int i=0;i<range.length;i++)
		{
			range[i]=i*2+1;
			System.out.print(range[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd_InArrays obj=new EvenOdd_InArrays();
		System.out.println(obj);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int[] arr=new int[sc.nextInt()];
		System.out.println(arr);
		obj.print_even(arr);
		obj.print_odd(arr);
		sc.close();		
	}

}
