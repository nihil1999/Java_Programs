/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to remove a given number in an array.
 */
public class RemovingNumber_inArray {

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
					arr1[i] = sc.nextInt(); 
				}
				
//for display user given array
				System.out.println("Array values ");
				for(int i=0;i<arr1.length;i++)
				{
					System.out.print(arr1[i] + " ");
				}
	}
	
	public void toRemove_GivenNumber()
	{
		System.out.println("\nEnter the number to remove: ");
		num=sc.nextInt();
		
		int count=0;
		for (int i = 0; i < arr1.length; i++) {
			if(num==arr1[i])					//to know how many numbers are in the array to set the new array size.
				count++;
		}
//to storing in a new array. 		
		arr2 = new int[arr1.length-count];
		
		int index=0;		//i have taken new variable for new array index so it will be consecutive.
		for (int i = 0; i < arr1.length; i++) {
			if(num!=arr1[i]) 
			{					//other than the given number. 
				arr2[index]=arr1[i];		
				index++;		
			}
		}
		
//to store in same array
		int index1=0;
		for (int i = 0; i < arr1.length; i++) {
			if(num!=arr1[i]) 
			{					//other than the given number. 
				arr1[index1]=arr1[i];		
				index1++;
			}
		}

//to display the array after removing the given number in same array.
		System.out.println("\nArray values after removing the given number = " + num + " in the same array.\n");
		for(int i=0;i<index1;i++)
		{
			System.out.print(arr1[i] + " ");
		}
	}

	
	public void display()
	{
		System.out.println("\nArray values after removing the given number = " + num + " in new array.\n");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingNumber_inArray obj=new RemovingNumber_inArray();
		obj.to_AssignValues();
		obj.toRemove_GivenNumber();
		obj.display();
	}

}
