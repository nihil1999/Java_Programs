package arraySorting;

import java.util.Scanner;

//to print the maximum number in an array.

public class GreaterNumber_InArray {
	
	public int check_greater_number()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int arr[]=new int [sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for " +i+" index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int max=arr[0];			//i haven taken first index element is maximum.
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])		//if a number is greater than the first index then that number is maximum number.
			{
				max=arr[i];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterNumber_InArray obj=new GreaterNumber_InArray();
		int max=obj.check_greater_number();
		System.out.println("\n\nMaximum number is: "+ max);
	}
}
