/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class First_2SmallNumbers_inArray_WithoutSorting {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	
	public void toFind_smallNumber()
	{
		System.out.println("Enter the array length: ");
		
		arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index");
			arr[i]=sc.nextInt();
		} 
		
		System.out.println("\n");
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		} 
		
		System.out.println("\n");
		
		int small1=Integer.MAX_VALUE,index1=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(small1>arr[i])
			{
				small1=arr[i];				
				index1=i;
			}
		} 
		
		int small2=Integer.MAX_VALUE,index2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(small2>arr[i] && arr[i]!=small1)		
			{
				small2=arr[i];
				index2=i;
			}
		} 
		
		System.out.println("\nMinimum element in an array are: "+small1+" in "+index1+" index and "+small2+" in "+index2+" index");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_2SmallNumbers_inArray_WithoutSorting obj=new First_2SmallNumbers_inArray_WithoutSorting();
		obj.toFind_smallNumber();
	}

}
