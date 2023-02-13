/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class CountOf_givenElement_inArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
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
	
	public void to_countgivenNumber_inArray()
	{
		System.out.println("\nEnter the number to search: ");
		num=sc.nextInt();
		
		int count=0;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]==num)
				count++;
		}
		
		System.out.println("The given number (" +num+ ") is "+count+" times presented in an array.\n");
	}
	
	public void display()
	{
//for display user given array
		System.out.println("Array values ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOf_givenElement_inArray obj=new CountOf_givenElement_inArray();
		obj.to_AssignValues();
		obj.to_countgivenNumber_inArray();
		obj.display();
	}

}
