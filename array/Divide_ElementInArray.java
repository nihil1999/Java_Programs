/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to divide all element in an array and store it in the same array.
 */
public class Divide_ElementInArray {

	/**
	 * @param args
	 * for assigning values to an array from the user.
	 */
	
	public int[] to_AssignValues(Scanner sc)
	{
		System.out.println("Enter the range");
		int arr[]=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}

//to divide all element in an array and store it in the same array.
	public void to_divide(int[] arr,Scanner sc)
	{
		System.out.println("\nEnter the number to check: ");
		int num=sc.nextInt();		//for getting the number from user.  for eg: 3
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]/num;		
		}
	}
	
//for displaying the array
		public void display(int a[])
		{
			System.out.println("\nDisplaying the array values: ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+ " ");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divide_ElementInArray obj=new Divide_ElementInArray();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		obj.display(a);
		obj.to_divide(a, sc);
		System.out.println("\nDisplaying the array values after dividing all elements by the given number: ");
		obj.display(a);
	}

}
