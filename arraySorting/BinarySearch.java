/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *to find the given element by using binary search. find the middle element in the sorted array and checks if the given number matches middle index number 
 *else checks if given number is larger or smaller than the middle index element then if it is larger -> starting index would be middle+1 or if smaller -> maximum index would be middle-1.
 *the given number will be in middle index.... after dividing the process.
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	
	public void to_assign_values()
	{
		System.out.println("Enter the range: ");
		arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		for(int i:arr)				//to print the array values : advanced for loop.
		{
			System.out.print(i+" ");
		}
		
	}
	
	public int to_getNumber()
	{
		int temp;
		for(int i=0;i<arr.length;i++)					//first we need to sort the array in ascending or descending order.
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		
		System.out.println("\n\nArray after sorting \n");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n\nEnter the number to search: ");
		int num=sc.nextInt();

		int min_index=0;
		int max_index=arr.length-1;
		int mid;
		int result=-1;
		
		while(min_index<=max_index)							//if the minimum index values is higher than the maximum index then it breaks. this scenario happens when the given element is not in the array. 
		{
				mid=(min_index+max_index)/2;				//to find the middle element.
				if(num==arr[mid])							//if given number is in middle index element then it'll break.
					{
						result=mid;
						break;
					}
				else if(num>arr[mid])					//if given number is greater than the middle element then it will be in right side of the middle index.
				{
					min_index=mid+1;					//so starting index will starts from next to the middle index.
				}
				else									//if given number is lesser than the middle element then it will be in left side of the middle index.
					max_index=mid-1;					//so ending index will be one before the middle index.
			}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch obj=new BinarySearch();
		obj.to_assign_values();
		int result=obj.to_getNumber();
		System.out.println("\nThe given number is in "+result+" index.");
	}

}
