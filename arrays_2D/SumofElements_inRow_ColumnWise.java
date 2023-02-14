/**
 * 
 */
package arrays_2D;

import java.util.Scanner;

/**
 * @author logan
 *to sum the elements in row and column wise.
 */
public class SumofElements_inRow_ColumnWise {

	/**
	 * @param args
	 * 
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

//sum of all elements in row wise.
		for (int i = 0; i < arr1.length; i++) {
			int sum=0;
			for(int j=0;j<arr1[i].length;j++) {			//arr1[i].length -> length of that row.
				sum+=arr1[i][j];
			}
			System.out.println("\nSum of all elements in an array of "+i+" row is "+sum);
		}
		
//sum of all elements in column wise.
		System.out.println("\n");
				for (int i = 0; i < arr1[0].length; i++) {		//changing row into column so applying column length.
					int sum=0;
					for(int j=0;j<arr1.length;j++) {			//applying row length.
						sum+=arr1[j][i];
					}
					System.out.println("\nSum of all elements in an array of "+i+" column is "+sum);
				}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofElements_inRow_ColumnWise obj=new SumofElements_inRow_ColumnWise();
		obj.to_assignValues();
		obj.toSum_allElements();
	}

}
