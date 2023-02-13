package array;

import java.util.Scanner;

public class ReverseNumber_InArrays {
	
	public void reverse(int[] arr)
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " + i+" number: ");
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nArray in reverse order.\n");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber_InArrays obj=new ReverseNumber_InArrays();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int arr[]=new int[sc.nextInt()];
		obj.reverse(arr);
	}

}
