/**
 * 
 */
package arrays_2D;

import java.util.Scanner;

/**
 * @author logan
 *to sum all elements in an array.
 */
public class SumOfElements_inArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[][];

	public void to_assignValues() {
		System.out.println("Enter the range for rows and columns of 1st array: ");
		arr1 = new int[sc.nextInt()][sc.nextInt()];

//for 1st array.
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {			//arr1[i].length -> length of that row.
				System.out.println("Enter the value for " + i +" " + j + " index: ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nArray values \n");
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void toSum_allElements()
	{
		int sum=0;
		
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {			//arr1[i].length -> length of that row.
				sum+=arr1[i][j];
			}
		}
		System.out.println("\nSum of all elements in an array is "+sum);

//another method
		int total=0;
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {			//arr1[i].length -> length of that row.
				total+=arr1[i][j]+arr1[i][j];
				System.out.print(total+" ");
			}
		}
		System.out.println("\nSum of all elements in an array is "+total/2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfElements_inArray obj=new SumOfElements_inArray();
		obj.to_assignValues();
		obj.toSum_allElements();
	}

}
