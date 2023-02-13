/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *copying the array to new array in reverse order.
 */
public class NewArray_inReverseOrder {

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
				arr2 = new int[arr1.length];

				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Enter the value for " + i + " index: ");
					arr1[i] = sc.nextInt(); 
				}
	}
	
	public void toReverse_array()
	{
			for (int i = 0; i < arr1.length; i++) 
			{
				arr2[i]=arr1[arr1.length-i-1];
			}
		
	}
	
	public void display()
	{
		System.out.println("\nArray values of given array.");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\n\nNew array with reversing values of given array.");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewArray_inReverseOrder obj=new NewArray_inReverseOrder();
		obj.to_AssignValues();
		obj.toReverse_array();
		obj.display();
	}

}
