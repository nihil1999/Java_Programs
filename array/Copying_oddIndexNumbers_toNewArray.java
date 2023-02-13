/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to store odd index numbers in an array to new array.
 */
public class Copying_oddIndexNumbers_toNewArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
	int arr2[];
	
	public void to_AssignValues() {
		//for assigning 1st array from user.
				System.out.println("Enter the range for array: ");
				arr1 = new int[sc.nextInt()];

				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Enter the value for " + i + " index: ");
					arr1[i] = sc.nextInt(); 
				}
	}
	
	public void toCopy_oddIndexElements()
	{
		int count=0;
		for (int i = 0; i < arr1.length; i++) {
			if(i%2!=0)
				count++;
		}
		
		arr2=new int[count];
		
		int index=0;
		for (int i = 0; i < arr1.length; i++) {
			if(i%2!=0)
			{
				arr2[index]=arr1[i];
				index++;
			}
		}	
	}
	
	public void display()
	{
		System.out.println("\nArray values of given array.");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\n\nNew array with odd index values of given array.");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copying_oddIndexNumbers_toNewArray obj=new Copying_oddIndexNumbers_toNewArray();
		obj.to_AssignValues();
		obj.toCopy_oddIndexElements();
		obj.display();
	}

}
