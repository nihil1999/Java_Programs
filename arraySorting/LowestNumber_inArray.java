/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *to print the minimum number in an array.
 */
public class LowestNumber_inArray {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public int check_smallest_number()
	{
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
		
		int min=arr[0];				//i haven taken first index element is minimum.
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])		//if a number is lower than the first index then that number is lowest number.
			{
				min=arr[i];
			}
		}
		return min;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowestNumber_inArray obj=new LowestNumber_inArray();
		int low=obj.check_smallest_number();
		System.out.println("\n\nSmallest number in an array is "+low);
	}

}
