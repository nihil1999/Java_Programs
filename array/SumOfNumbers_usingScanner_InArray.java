package array;

import java.util.Scanner;

public class SumOfNumbers_usingScanner_InArray {
	
	public void sumOfNumbers(int[] arr)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number for " + i + " array");
			//int num=sc.nextInt();
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
			sum+=arr[i];
		}
		System.out.println("\nSum of n numbers: " + sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbers_usingScanner_InArray obj=new SumOfNumbers_usingScanner_InArray();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range: ");
		
		int[] arr=new int[s.nextInt()];
		obj.sumOfNumbers(arr);
	}

}
