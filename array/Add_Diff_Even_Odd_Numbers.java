package array;

import java.util.Scanner;
//for adding even and odd numbers in an index and diff btwn the sum of even and odd.

public class Add_Diff_Even_Odd_Numbers {

	public void add_even_odd_Numbers_inIndex()
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range for even numbers");
		int arr[]=new int[sc.nextInt()];
		
//for adding even numbers in an index
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+ i +" index number: ");
			arr[i]=sc.nextInt();			//for assigning user input values to array
		}
		
		 display(arr);
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)		//for adding even elements in an index.
			{
				sum+=arr[i];
			}
		}
	System.out.println("\nSum of even elements in an index is: " + sum);
	
//for adding odd numbers in an index
	
			int sum1=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)		//for adding odd elements in an index.
				{
					sum1+=arr[i];
				}
			}
		System.out.println("\nSum of odd elements in an index is: " + sum1);

//for finding difference of sum of even an dodd numbers in even and odd index
		
	int diff;
	diff=sum-sum1;
	System.out.println("\nDifference of sum of numbers in even and odd index is: " + diff);
	sc.close();
}

//for displaying the array
	
	public void display(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Diff_Even_Odd_Numbers obj=new Add_Diff_Even_Odd_Numbers();
		
		obj.add_even_odd_Numbers_inIndex();
	}

}
