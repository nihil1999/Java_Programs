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
	
	boolean flag=false;
	int range=0;
	
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
	{										// 2 1 5 8 7
		System.out.println();
		int j;
		for(int i=0;i<arr.length;i++)		// i=0  i=1  i=2 i=3
		{
			int count=0;
			for(j=1;j<=arr[i];j++)		//check until the number. i.e j<=2  j<=1 j<=5  j<=8
				{
					if(arr[i]%j==0)		//prime numbers are numbers which is only divisible by 1 and itself so count will be 2. 
						count++;		// 2%1==0 2%2==0(count=2)  1%1==0(count=1)  5%1==0 5%5==0(count=2)  8%1==0 8%2==0 8%4==0 8%8==0(count=4)
				}
			if(count==2)	//if count is 2 then its prime number
				{
				System.out.println(arr[i]+" is prime number.");
				range++;		// to know the array length i.e how many prime numbers
				flag=true;
				}
		}
		
		if(flag==false)
			System.out.println("There are no prime numbers in an array.");

//for storing prime numbers in new array.
		int pr[]=new int[range];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(j=1;j<=arr[i];j++)
				{
					if(arr[i]%j==0)
						count++;
				}
			if(count==2 )
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
				
				if(flag==true) {
					System.out.println("\n\nDisplaying the prime array values: ");
					for(int i=0;i<pr.length;i++)
					{
					System.out.print(pr[i]+ " ");
					}
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
