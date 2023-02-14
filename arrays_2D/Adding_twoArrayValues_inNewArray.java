/**
 * 
 */
package arrays_2D;

import java.util.Scanner;

/**
 * @author logan
 *for adding 2 array values and store it in new array.
 */
public class Adding_twoArrayValues_inNewArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[][];
	int arr2[][];
	int arr3[][];

	public void to_assignValues() {
		System.out.println("Enter the range for rows and columns of 1st array: ");
		arr1 = new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter the range for rows and columns of 2nd array: ");
		arr2 = new int[sc.nextInt()][sc.nextInt()];

//for 1st array.
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {			//arr1[i].length -> length of that row.
				System.out.println("Enter the value for " + i +" " + j + " index: ");
				arr1[i][j] = sc.nextInt();
			}
		}

//for 2nd array.
		for (int i = 0; i < arr2.length; i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("Enter the value for " + i +" " + j + " index: ");
				arr2[i][j] = sc.nextInt();
			}
		}
	}
	
	public void toAddElements()
	{
		arr3 = new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i < arr3.length; i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
	}
	
	public void display()
	{
		System.out.println("\nArray 1 \n");
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nArray 2 \n");
		for (int i = 0; i < arr2.length; i++) {
			for(int j=0;j<arr2[i].length;j++) {
			System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nArray 3 : Addition of 2 array values \n");
		for (int i = 0; i < arr3.length; i++) {
			for(int j=0;j<arr3[i].length;j++) {
			System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adding_twoArrayValues_inNewArray obj=new Adding_twoArrayValues_inNewArray();
		obj.to_assignValues();
		obj.toAddElements();
		obj.display();
	}

}
