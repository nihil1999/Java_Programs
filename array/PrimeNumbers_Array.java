/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to check the prime numbers in an array and store it in new array.
 */
public class PrimeNumbers_Array {

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

//for checking prime numbers and store it in new array. 
	public int[] toCheck_PrimeNumber(int arr[],Scanner sc)
	{
		System.out.println();
		int count=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2 || arr[i]==3 || arr[i]==5 || arr[i]==7) 
			{	
				System.out.println(arr[i]+" is prime number.");
				count++;
				flag=true;
			}
			if(arr[i]>7 && arr[i]%2!=0 && arr[i]%3!=0 && arr[i]%5!=0 && arr[i]%7!=0 )
				{
					System.out.println(arr[i]+" is prime number.");
					count++;
					flag=true;
				}
		}
		if(flag==false)
			System.out.println("There are no prime numbers in an array.");
		
		int pr[]=new int[count];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2 || arr[i]==3 || arr[i]==5 || arr[i]==7) 
			{	
				pr[index]=arr[i];
				index++;
			}
			if(arr[i]>7 && arr[i]%2!=0 && arr[i]%3!=0 && arr[i]%5!=0 && arr[i]%7!=0 )
				{
					pr[index]=arr[i];
					index++;
				}
		}
		
		return pr;
	
	}
	
//for displaying the array
			public void display(int a[],int pr[])
			{
				System.out.println("\nDisplaying the array values: ");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+ " ");
				}
				
				System.out.println("\nDisplaying the prime array values: ");
				for(int i=0;i<pr.length;i++)
				{
					System.out.print(pr[i]+ " ");
				}	
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers_Array obj=new PrimeNumbers_Array();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		int pr[]=obj.toCheck_PrimeNumber(a, sc);
		obj.display(a, pr);
	}

}
