package array;

import java.util.Scanner;
//for adding the elements in the even ,odd index and diff btwn the sum of even and odd.
public class Add_Diff_OfEven_Odd_Index {
	
	public void add_even_odd_Index()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range for even numbers");
		int arr[]=new int[sc.nextInt()];
		
//for adding numbers in even index
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+ i +" index number: ");
			arr[i]=sc.nextInt();			//for assigning user input values to array
		}
		
		 display(arr);
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)		//for adding elements in even index.
			{
				sum+=arr[i];
			}
		}
	System.out.println("\nSum of elements in even index is: " + sum);
	
//for adding numbers in odd index
	
			int sum1=0;
			for(int i=0;i<arr.length;i++)
			{
				if(i%2!=0)		//for adding elements in odd index.
				{
					sum1+=arr[i];
				}
			}
		System.out.println("\nSum of elements in odd index is: " + sum1);

//for finding difference of sum of numbers in even and odd index
		
	int diff;
	diff=sum-sum1;
	System.out.println("\nDifference of sum of numbers in even and odd index is: " + diff);
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
		Add_Diff_OfEven_Odd_Index obj=new Add_Diff_OfEven_Odd_Index();
		
		obj.add_even_odd_Index();
	}

}
