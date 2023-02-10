package array;

import java.util.Scanner;

public class MultiplyOf_ArrayElements {
	
	public void multiply()
	{
		System.out.println("Enter the range:");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " + i +" index number: ");
			arr[i]=sc.nextInt();
		}
		
		int mul=1;
		for(int i=0;i<arr.length;i++)
		{
			mul*=arr[i];
		}
		System.out.println("\nMultiply of array elements: " + mul);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyOf_ArrayElements obj=new MultiplyOf_ArrayElements();
		obj.multiply();
	}

}
