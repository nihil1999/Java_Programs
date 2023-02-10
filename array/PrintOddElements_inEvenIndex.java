/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to print the odd elements in an even index of an array.
 */
public class PrintOddElements_inEvenIndex {

	/**
	 * @param args
	 *  for assigning values to an array from the user.
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
	
	public int[] to_printOddElement_inEvenIndx(int[] arr,Scanner sc)
	{
		System.out.println();
		int count=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0 && arr[i]%2!=0)
			{
				System.out.println(arr[i] +" is odd element in "+i+ " index");
				count++;
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("There are no odd numbers in an even index of an array.");
		
		int odd[]=new int[count];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0 && arr[i]%2!=0)
			{
				odd[index]=arr[i];
				index++;
			}
		}
		
		return odd;	
	}
	
	public void display(int a[],int odd[])
	{
		System.out.println("\nDisplaying the array values: \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\n\nDisplaying the odd array values in even index: \n");
		for(int i=0;i<odd.length;i++)
		{
			System.out.print(odd[i]+ " ");
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOddElements_inEvenIndex obj=new PrintOddElements_inEvenIndex();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		int odd[]=obj.to_printOddElement_inEvenIndx(a, sc);
		obj.display(a, odd);
	}

}
