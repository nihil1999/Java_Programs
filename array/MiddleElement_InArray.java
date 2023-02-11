/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to find the middle element of an array.
 *for odd number range - middle number is range/2  i.e for range 5 (index -4) - middle number is 3 in index it is 2.
 *for even number range - middle number is range/2 and next number  i.e for range 6 (index -5) - middle numbers are 3 and 4 in index it is 2 and 3.
 */
public class MiddleElement_InArray {

	/**
	 * @param args
	 */

	Scanner sc = new Scanner(System.in);
	int arr[];

//for assigning values from user.
	public void to_assignValues() {
		System.out.println("Enter the range");
		arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for " + i + " index: ");
			arr[i] = sc.nextInt(); // 1 2 3 4 5
		}
	}

	public void to_printMiddleElement_inArray() {
		int mid = arr.length / 2;       //  for odd number range - middle number is range/2  i.e for range 5 (index -4) - middle number is 3 in index it is 2.
		for (int i = 0; i < arr.length; i++) {
			if ((arr.length % 2) != 0 && i == mid)	//if range is odd number then enters into this block.  // 0 1 2 - middle is 2.
				System.out.println("Middle element in an array is: " + arr[i] + " and index is: " + i);
			if ((arr.length % 2) == 0) {			//if range is even number then enters into this block.   // 0 1 2 3 - middle is 1 and 2.
				if (i == mid || i == mid - 1)		//and checks if index is = mid or mid-1 bcauz for even range i.e. 4(index 3)  - middle element are 1 and 2 index.
					System.out.println("Middle element in an array is: " + arr[i] + " and index is: " + i);
			}
		}
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\n\nArray values\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleElement_InArray obj = new MiddleElement_InArray();
		obj.to_assignValues();
		obj.display();
		obj.to_printMiddleElement_inArray();
	}
}
