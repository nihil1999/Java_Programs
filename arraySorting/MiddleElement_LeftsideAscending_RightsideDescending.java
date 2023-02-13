/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *take middle element in an array in that left side should be in ascending order and right side should be in descending order.
 */
public class MiddleElement_LeftsideAscending_RightsideDescending {

	/**
	 * @param args
	 */

	Scanner sc = new Scanner(System.in);
	int arr[];

	public void to_assignValues() {
		System.out.println("Enter the range");
		arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for " + i + " index: ");
			arr[i] = sc.nextInt();
		}

//for displaying user given array. 
		System.out.println("\nArray values ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void ascending_descending() {
		int mid = arr.length / 2;
		int min, max;

		for (int i = 0; i < arr.length; i++) 		//takes on number 
		{
			if (arr.length % 2 != 0) 		//for odd range
				{
					if (i != mid) 			//i shouldn't be middle index
					{
						for (int j = i; j < arr.length; j++) //to check with next numbers
						{
							if (i < mid && j < mid) 	//only left side of middle index should be in ascending order.
							{
								if (arr[i] > arr[j]) 
								{
									min = arr[j];		//first i stored the minimum value.
									arr[j] = arr[i];	//maximum element shift.
									arr[i] = min;		//minimum value will be assigned to arr[i] index.
								}
							} 
							else if (i > mid && j > mid) 	//only right side of middle index should be in descending order.
							{
								if (arr[i] < arr[j]) 
								{
									max = arr[j];		//first i stored the maximum value.
									arr[j] = arr[i];	// minimum element shift.
									arr[i] = max;		//maximum value will be assigned to arr[i] index.
								}
							}
						}
					}
				} 
			else 							//for even range
			{
				if (i != mid && i != mid - 1) 		//i shouldn't be equal to middle index and before the middle index.
				{
					for (int j = i + 1; j < arr.length; j++) 	//to check with next numbers
					{
						if (j < mid && i < mid && j < mid - 1) 	//only left side of before the middle index should be in ascending order.
						{
							if (arr[i] > arr[j]) 
							{
								min = arr[j];
								arr[j] = arr[i];
								arr[i] = min;
							}
						} 
						else if (i > mid && j > mid)  //only right side of middle index should be in descending order.
						{
							if (arr[i] < arr[j]) 
							{
								max = arr[j];
								arr[j] = arr[i];
								arr[i] = max;
							}
						}
					}
				}
			}
		}
	}

	
	public void display() {
		System.out.println("\n\nArray values after sorting leftside ascending and rightside descending ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleElement_LeftsideAscending_RightsideDescending obj = new MiddleElement_LeftsideAscending_RightsideDescending();
		obj.to_assignValues();
		obj.ascending_descending();
		obj.display();
	}
}
