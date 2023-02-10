/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to check the perfect number in an array.
 */
public class PerfectNumberIn_Array {

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
	
	public int[] to_Check_PerfectNumber(int arr[],Scanner sc)
	{
		System.out.println();
		int count=0,sum;
		boolean check=false;
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=1;j<=arr[i]/2;j++)
			{
				if(arr[i]%j==0)
					{
						sum=sum+j;
					}
			}
			if(sum==arr[i]) {
				System.out.println(arr[i]+" is a perfect number.");
				check=true;
				count++;
			}
		}
		if(check==false)
			System.out.println("There are no perfect numbers in an array.");
		
		int perfect[]=new int[count];
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=1;j<=arr[i]/2;j++)
			{
				if(arr[i]%j==0)
					{
						sum=sum+j;
					}
			}
			if(sum==arr[i]) {
				perfect[index]=arr[i];
				index++;
			}
		}
		
		return perfect;
		
	}
	
	//for displaying the array
	public void display(int a[],int per[])
	{
		System.out.println("\nDisplaying the array values: \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\n\nDisplaying the perfect array values: \n");
		for(int i=0;i<per.length;i++)
		{
			System.out.print(per[i]+ " ");
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumberIn_Array obj=new PerfectNumberIn_Array();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		int per[]=obj.to_Check_PerfectNumber(a, sc);
		obj.display(a, per);
	}

}
