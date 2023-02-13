/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to sum the odd index numbers in array.
 */
public class AdditionOf_OddIndex_Numbers_inArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
	
	public void to_AssignValues() {
//for assigning 1st array from user.
				System.out.println("Enter the range for array: ");
				arr1 = new int[sc.nextInt()];

				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Enter the value for " + i + " index: ");
					arr1[i] = sc.nextInt(); 
				}
				
//for display user given array
				System.out.println("\nArray values ");
				for(int i=0;i<arr1.length;i++)
				{
					System.out.print(arr1[i] + " ");
				}
				
	}
	
	public void toSum_OddIndexNumbers()
	{
			int sum=0;
			
			for(int i=0;i<arr1.length;i++)
			{
				if(i%2!=0)
					sum+=arr1[i];
			}
			System.out.println("\n\nThe sum of numbers in odd index is: "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOf_OddIndex_Numbers_inArray obj=new AdditionOf_OddIndex_Numbers_inArray();
		obj.to_AssignValues();
		obj.toSum_OddIndexNumbers();
	}

}
