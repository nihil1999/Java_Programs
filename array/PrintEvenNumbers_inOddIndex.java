/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to print the even elements in an odd index of an array.
 */
public class PrintEvenNumbers_inOddIndex {

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
	
	public int[] to_print_EvenElement_inOddIndx(int[] arr,Scanner sc)
	{
		System.out.println();
		int count=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0 && arr[i]%2==0)
			{
				System.out.println(arr[i] +" is even element in "+i+ " index");
				count++;
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("There are no even numbers in an odd index of an array.");
		
		int even[]=new int[count];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0 && arr[i]%2==0)
			{
				even[index]=arr[i];
				index++;
			}
		}
		
		return even;	
	}
	
	public void display(int a[],int even[])
	{
		System.out.println("\nDisplaying the array values: \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\n\nDisplaying the even array values in odd index: \n");
		for(int i=0;i<even.length;i++)
		{
			System.out.print(even[i]+ " ");
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEvenNumbers_inOddIndex obj=new PrintEvenNumbers_inOddIndex();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		int even[]=obj.to_print_EvenElement_inOddIndx(a, sc);
		obj.display(a, even);
	}
}
