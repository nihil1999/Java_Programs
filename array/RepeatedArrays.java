/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *for finding the first repeated element in an array.
 */
public class RepeatedArrays {

	/**for assigning values to an array from the user.
	 * @param args
	 */
	
	public int[] to_assign_values_inArray(Scanner sc)
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
	
//to find the first repeated elements in an array
	public void to_find_first_repeatedNumber(int[] arr) {
		
		System.out.println();
		int count=0,flag=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]==arr[j])		//same elements will enter into the condition.
				{
					System.out.println("The first repeated element is "+arr[i]+" and the repeated index is "+i);
					count++;		//count becomes 1 becauz to print the first repeated element only.
					flag=1;			//if the number repeats it becomes 1 else 0.
					break;			//to break the inner loop bcauz we want first repeated element.
				}
			}
			if(count==1)			//to break outer loop if numbers repeats then count is 1.
				break;
		}
		if(flag==0)			//if no number repeats then the flag will be 0.
			System.out.println("No repeated elements in an array.");	
	}
	
//for finding all the repeated elements in an array
//	public void to_FindAllRepeatedElements(int[] arr)
//	{
//		System.out.println();
//		int index=0,count=0,flag=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{	
//				if(arr[i]==arr[j])
//				{
//					count++;
//					index=j;
//					System.out.println("The "+count+" repeated element is "+arr[i]+" and the repeated index is "+index);
//					flag=1;
//					break;
//				}
//			}
//		}
//		if(flag==0)
//			System.out.println("No repeated elements in an array.");
//	}
	
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
		RepeatedArrays obj=new RepeatedArrays();
		
		Scanner sc=new Scanner(System.in);
		int a[]=obj.to_assign_values_inArray(sc);
		obj.to_find_first_repeatedNumber(a);
		//obj.to_FindAllRepeatedElements(a);
		obj.display(a);
		
	}

}
