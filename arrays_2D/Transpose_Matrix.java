/**
 * 
 */
package arrays_2D;

import java.util.Scanner;

/**
 * @author logan
 *Transpose of a given matrix. 
 * 1 2 
 * 3 4
 *  
 * 1 3
 * 2 4
 */
public class Transpose_Matrix {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[][];
	int arr2[][];

	public void to_assignValues() {
		System.out.println("Enter the range for rows and columns: ");
		arr1 = new int[sc.nextInt()][sc.nextInt()];

		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Enter the value for " + i +" " + j + " index: ");
				arr1[i][j] = sc.nextInt();
			}
		}
	}
		
		
		public void toTranspose() {
		arr2 = new int[arr1[0].length][arr1.length];
		
//by using variable for index count of new array.		
//		int index1=0;
//		for (int i = 0; i < arr1.length; i++) {
//			int index2=0;
//			for(int j=0;j<arr1[i].length;j++) {
//				
//				arr2[index2][index1] = arr1[i][j];
//				index2++;
//			}
//			index1++;
//		}
		
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
													//row element need to be shifted to columns. so i m giving column(j) first so row value will be assigned to column.
				arr2[j][i] = arr1[i][j];			// 00 10 20 30 ... = 00 01 02 03...
			}
		}		
	}
	
	public void display()
	{
		System.out.println("\nMatrix \n");
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose matrix \n");
		for (int i = 0; i < arr2.length; i++) {
			for(int j=0;j<arr2[i].length;j++) {
			System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transpose_Matrix obj=new Transpose_Matrix();
		obj.to_assignValues();
		obj.toTranspose();
		obj.display();
	}

}
