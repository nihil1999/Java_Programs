/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class MiddleElement_LeftsideAscending_RightsideDescending {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	
	public void to_assignValues()
	{
		System.out.println("Enter the range");
		arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr[i]=sc.nextInt();											 
		}
		
		System.out.println("\nArray values ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void ascending_descending()
	{
		int mid=arr.length/2;
		int min,max;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr.length % 2 != 0) {
				if (i != mid) {
					for (int j = i; j < arr.length; j++) {
						if (j < mid && i < mid) {
							if (arr[i] > arr[j]) {
								min = arr[j];
								arr[j] = arr[i];
								arr[i] = min;
							}
						} else if (i > mid && j > mid) {
							if (arr[i] < arr[j]) {
								max = arr[j];
								arr[j] = arr[i];
								arr[i] = max;
							}
						}
					}
				}
			}
			else
			{
				if (i != mid && i!=mid-1) {
					for (int j = i; j < arr.length; j++) {
						if (j < mid && i < mid) {
							if (arr[i] > arr[j]) {
								min = arr[j];
								arr[j] = arr[i];
								arr[i] = min;
							}
						} else if (i > mid && j > mid) {
							if (arr[i] < arr[j]) {
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
		System.out.println("\nArray values after sorting ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleElement_LeftsideAscending_RightsideDescending obj=new MiddleElement_LeftsideAscending_RightsideDescending();
		obj.to_assignValues();
		obj.ascending_descending();
		obj.display();
	}

}
