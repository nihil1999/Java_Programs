/**
 * 
 */
package arrays_2D;

import java.util.Scanner;

/**
 * @author logan
 *to change the even numbers in an array with -1.
 */
public class ChangeEvenElement_inArray {

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
	
	public void toChange_evenElement()
	{
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {		
				if(arr1[i][j]%2==0)
				arr1[i][j] = -1;
			}
		}
	}
	
	public void display()
	{
		System.out.println("\nArray after changing even numbers \n");
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeEvenElement_inArray obj=new ChangeEvenElement_inArray();
		obj.to_assignValues();
		obj.toChange_evenElement();
		obj.display();
	}

}
