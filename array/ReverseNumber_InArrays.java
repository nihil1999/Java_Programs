package array;

import java.util.Scanner;

public class ReverseNumber_InArrays {
	
	public void reverse(int[] range)
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<range.length;i++)
		{
			System.out.println("Enter the " + i+" number: ");
			range[i]=s.nextInt();
		}
		//s.close();
		for(int i=range.length-1;i>=0;i--)
		{
			System.out.print(range[i] + " ");
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
