/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *for joining 2 arrays into new array.
 */
public class JoiningArrays {

	/**
	 * @param args
	 * arr1,arr2,b - all arrays are instance variable so that i can use anywhere in the method without passing to all non-static methods.
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr1[];
	int arr2[];
	int b[];
	
	public void to_AssignValues()
	{
//for assigning 1st array from user.
		System.out.println("Enter the range for 1st array: ");
		 arr1=new int[sc.nextInt()];
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr1[i]=sc.nextInt();										// 1 2 3 4 5 
		}
		
//for assigning 2nd array from user.
		System.out.println("Enter the range for 2nd array: ");
		arr2=new int[sc.nextInt()];
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr2[i]=sc.nextInt();										// 6 7 8
		}
		
	}

//for joining arrays	
	public void to_joinArrays()
	{
			int range=arr1.length+arr2.length;		//to find the length of 3rd length i added 1st and 2nd array length.
			b=new int[range];
			
			for(int i=0;i<range;i++)
			{
				if(i<arr1.length)	//first i need to store the 1st array values so if the index value greater than 1st array length then it goes to else condition.			
					b[i]=arr1[i];	// i.e 1 2 3 4 5 (i value upto 4).
				
				else				//when index value greater than or equal to 5 it enters into else block  i=5 , arr1.length=5
					b[i]=arr2[i-arr1.length];	// i.e 6 7 8 (arr2[i-arr1.length] => array2 starts with index 0 so arr2[5-5=0] arr2[6-5=1]....
			}	
	}
	
	public void display()
	{
		System.out.println("\n\nDisplaying the array values for 1 array: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println("\n\nDisplaying the array values for 2 array: ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println("\n\nDisplaying the array values after joining 2 arrays: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoiningArrays obj=new JoiningArrays();
		obj.to_AssignValues();
		obj.to_joinArrays();
		obj.display();
		
	}

}
