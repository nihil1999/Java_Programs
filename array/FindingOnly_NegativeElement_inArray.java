/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to find the negative numbers in an array.
 */
public class FindingOnly_NegativeElement_inArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
	int arr2[];
	
	public void to_AssignValues() {
		//for assigning 1st array from user.
				System.out.println("Enter the range for array: ");
				arr1 = new int[sc.nextInt()];

				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Enter the value for " + i + " index: ");
					arr1[i] = sc.nextInt(); 
				}
				
		//for display user given array
				System.out.println("Array values ");
				for(int i=0;i<arr1.length;i++)
				{
					System.out.print(arr1[i] + " ");
				}
		}
	
	public void toFind_negativenumbers()
	{
		int count=0;
		System.out.println("\n");
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<0)
				{
				count++;
					System.out.println("Negative numbers in an array is "+ arr1[i] + " ,index = "+i);
				}
		}
		
//to store the negative numbers in new array.
		arr2=new int[count];
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<0)
				{
					arr2[index]=arr1[i];
					index++;
				}
		}
		
//for display user given array
		System.out.println("\n\nArray values after storing negative values in new array. \n");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingOnly_NegativeElement_inArray obj=new FindingOnly_NegativeElement_inArray();
		obj.to_AssignValues();
		obj.toFind_negativenumbers();
	}

}
