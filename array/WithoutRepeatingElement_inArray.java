/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class WithoutRepeatingElement_inArray {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr1[];
	int arr2[];
	int b[];
	int count;
	
	public void to_AssignValues()
	{
//for assigning 1st array from user.
		System.out.println("Enter the range for 1st array: ");
		 arr1=new int[sc.nextInt()];
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr1[i]=sc.nextInt();										// 1 2 3 4 5 
		}
		
//for assigning 2nd array from user.
		System.out.println("Enter the range for 2nd array: ");
		arr2=new int[sc.nextInt()];
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr2[i]=sc.nextInt();										// 6 7 8
		}
		
	}
	
	public void to_findRepeatedElements()
	{
		count=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					{
						count++;
						break;
					}
			}
		}
	}
	
	public void printArray_WithoutDuplicateElements()
	{
		int range=arr1.length + arr2.length;
		range=range-count;
		b=new int[range];
		int j,index=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					break;	
			}
			if(j==arr2.length)
			{
				b[index]=arr1[i];
				index++;
			}
		}
	}
	
	public void display()
	{
		System.out.println("\n\nDisplaying the array values for 1 array: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println("\n\nDisplaying the array values for 2 array: ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println("\n\nDisplaying the array values after removing the duplicate elements 2 arrays: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutRepeatingElement_inArray obj=new WithoutRepeatingElement_inArray();
		obj.to_AssignValues();
		obj.to_findRepeatedElements();
		obj.printArray_WithoutDuplicateElements();
		obj.display();
		
	}

}
