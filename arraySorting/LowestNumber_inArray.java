/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *
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
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
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
