/**
 * 
 */
package arrays_2D;

import java.util.Scanner;

/**
 * @author logan
 *to multiply the 1st array row with 2nd array all rows and follow...
 * a[2][2]={{1,2},{3,4}} b[2][2]={{5,6},{7,8}} =>  1*5+1*6 =11 , 2*7+2*8=30, 3*5+3*6=33, 4*7+4*8=60
 * c[2][2]={{11,30},{33,60}}
 */
public class MultiplyOf_Rows_inarray_withAllRows {

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
		arr2 = new int[arr1.length][arr1.length];

//for 1st array.
		System.out.println("For first array.\n");
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {			//arr1[i].length -> length of that row.
				System.out.println("Enter the value for " + i +" " + j + " index: ");
				arr1[i][j] = sc.nextInt();
			}
		}

//for 2nd array.
		System.out.println("For second array.\n");
		for (int i = 0; i < arr2.length; i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("Enter the value for " + i +" " + j + " index: ");
				arr2[i][j] = sc.nextInt();
			}
		}
	}

//to multiply the 1st array row with 2nd array all rows and follow...
	public void toSum_withAllRows()
	{
			arr3 = new int[arr1.length][arr1.length];
			int sum=0;
//here taken 2 for loops becauz 1st array value need to be multiplied with all rows of 2nd array.
			for (int i = 0; i < arr1.length; i++) 	//i=0  					i=1....
			{
				for(int j=0;j<arr1.length;j++) 		//j=0  j=1
				{
					for(int k=0;k<arr1.length;k++) 	//k=0 k=1  k=0 k=1
					{
						sum+= (arr1[i][j]*arr2[j][k]);		//arr1[0][0]*arr2[0][0], arr1[0][0]*arr2[0][1] , arr1[0][1]*arr2[1][0], arr1[0][1]*arr2[1][1]
					}
					
					arr3[i][j]=sum;
					sum=0;
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
		
		System.out.println("\nArray 3 : Multiplication of 1st array row with all rows in 2nd array. \n");
		for (int i = 0; i < arr3.length; i++) {
			for(int j=0;j<arr3[i].length;j++) {
			System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyOf_Rows_inarray_withAllRows obj=new MultiplyOf_Rows_inarray_withAllRows();
		obj.to_assignValues();
		obj.toSum_withAllRows();
		obj.display();
	}

}
