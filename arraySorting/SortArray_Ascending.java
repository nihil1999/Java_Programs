/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *to sort the array in ascending order.
 */
public class SortArray_Ascending {

	/**
	 * @param args
	 * for assigning values to an array from the user.
	 */
	
	public int[] to_AssignValues(Scanner sc)
	{
		System.out.println("Enter the range");
		int arr[]=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array values");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		return arr;
	}
	
	public void to_sortInAscendingOrder(int[] arr)
	{
		int temp;								// 7 5 2 1 3 9 
		for(int i=0;i<arr.length;i++)			//i=0;
		{
			for(int j=i+1;j<arr.length;j++)		//j=i+1;
			{
				if(arr[i]>arr[j])				//7>5  so small value comes first for that we need to swap.
				{
					temp=arr[i];			//to store the greater value so that it can be swapped. i.e. temp=7
					arr[i]=arr[j];			//now store the small value in the place of large value i.e arr[0]=5
					arr[j]=temp;			//now store the large value in the place of small value  i.e arr[1]=7
				}
			}
		}
	}
	
	public void display(int arr[])
	{
		System.out.println("\n\nDisplaying the array values after sorting: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArray_Ascending obj=new SortArray_Ascending();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		obj.to_sortInAscendingOrder(a);
		obj.display(a);	
	}
}
