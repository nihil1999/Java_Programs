package array;

import java.util.Scanner;
//for checking that the given number is in the array.
public class Check_Number_In_Array {
	
	public void to_Assign_Number_inArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int limit=sc.nextInt();
		int arr[]=new int[limit];
		
		for(int i=0;i<limit;i++)
		{
			System.out.println("Enter the " + i +" index number");
			arr[i]=sc.nextInt();
		}
		
		display(arr);
		to_checkNumber_inArray(arr);
	}
	
	public void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public void to_checkNumber_inArray(int arr[])
	{
		int flag=0;
		System.out.println("\nGive number to check");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
			{
				System.out.println("Given number is present in the " + i + " index of an array.");
				flag=1;
			}	
		}
		if(flag==0)
			System.out.print("Given number is not present in the given array.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check_Number_In_Array obj=new Check_Number_In_Array();
		obj.to_Assign_Number_inArray();
	}

}
