/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *split an array and store odd number in one array and even number in another array.
 */
public class Split_Array {

	/**
	 * @param args
	 * 
	 */
	
	public int[] to_AssignValues(Scanner sc)
	{
		System.out.println("Enter the range");
		int arr[]=new int[sc.nextInt()];

//for assigning values to an array from the user.
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr[i]=sc.nextInt();
		}
		
//for displaying the array	
		System.out.println("\nArray values");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		return arr;
	}

//to split an array and store odd number in one array and even number in another array.	
	public void to_split_Array(int[] arr,Scanner sc)
	{
//to know how many odd and even numbers so that we can assign the length of the new array.
		int evencount=0,oddcount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				evencount++;		//for even array length
			else
				oddcount++;		////for odd array length
		}
		
		int evenarray[]=new int[evencount];		//to store an even numbers
		int oddarray[]=new int[oddcount];		//to store an odd numbers
		
		int evenindex=0,oddindex=0;				//to start the index of even and odd array in 0.
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
				evenarray[evenindex]=arr[i];		//to store in array orderly i.e. index - 0,1,2,3... 
				evenindex++;		//even array length increases 
			}
			else
				{
				oddarray[oddindex]=arr[i];			//to store in array orderly i.e. index - 0,1,2,3... 
				oddindex++;		////odd array length increases
				}
		}
		
		display(evenarray,oddarray);
	}
	
//for displaying the array	
	public void display(int[] evenarray, int[] oddarray) {
		// TODO Auto-generated method stub
		System.out.println("\n\nEven array");
		for(int i=0;i<evenarray.length;i++)
		{
			System.out.print(evenarray[i]+" ");
		}
		
		System.out.println("\n\nOdd array");
		for(int i=0;i<oddarray.length;i++)
		{
			System.out.print(oddarray[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Split_Array obj=new Split_Array();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		obj.to_split_Array(a, sc);
		
	}

}
