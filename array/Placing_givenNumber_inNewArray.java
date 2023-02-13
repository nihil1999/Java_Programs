/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Placing_givenNumber_inNewArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
	int arr2[];
	int num;
	
	public void to_AssignValues() {
//for assigning 1st array from user.
				System.out.println("Enter the range for array: ");
				arr1 = new int[sc.nextInt()];

				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Enter the value for " + i + " index: ");
					arr1[i] = sc.nextInt(); // 1 2 3 4 5
				}
	}
	
	public void toPlace_givenNumber_inNewArray()
	{
		arr2=new int[arr1.length+1];
		
		System.out.println("\nEnter the number to place: ");
		num=sc.nextInt();
		
		for (int i = 0; i < arr2.length; i++) {
			if(i==arr2.length-1)
				arr2[i]=num;
			else
				arr2[i]=arr1[i];
		}
	}
	
	public void display()
	{
//for display user given array
		System.out.println("Array values ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\nArray values after placing the given number = " + num + " in the last index of a new array.\n");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Placing_givenNumber_inNewArray obj=new Placing_givenNumber_inNewArray();
		obj.to_AssignValues();
		obj.toPlace_givenNumber_inNewArray();
		obj.display();
	}

}
