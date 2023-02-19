/**
 * 
 */
package arraySorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 * @author logan
 *
 */
public class First_2BigNumbersInArray_without_sorting {

	/**
	 * @param args
	 */

	Scanner sc=new Scanner(System.in);
	int arr[];
	
	public void toGet_BigNumbers()
	{
		System.out.println("Enter the array length: ");
		
		arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index");
			arr[i]=sc.nextInt();
		} 
		
		System.out.println("\n");
		
//to print the array.
		for(int i:arr)
		{
			System.out.print(i+" ");
		} 
		
		System.out.println("\n");

//method 1
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
						max=arr[i];				//it will hold the first big number. 	
		} 
		
		int max2;
		
		if(arr[0]!=max)				//if the big number is not in first index then max2 will holds the first index value.
			max2=arr[0];
		else
			max2=arr[1];			//if the big number is in first index then the max2 is second index value.

//to find second big.
		for(int i=0;i<arr.length;i++)
		{
			if(max2<arr[i] && arr[i]!=max)		//here if the array number is bigger than the max2 then max2 will hold that number, but i want second big so if the index of an array holds the big then it will not enter.
					max2=arr[i];
		} 

//to find the index of first and second big.
		int max1_index=0,max2_index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(max==arr[i])		
				max1_index=i;
			else if(arr[i]==max2)
				max2_index=i;
			
		} 
		
		System.out.println("Maximum element in an array are: "+max+" in "+max1_index+" index and "+max2+" in "+max2_index+" index");	
		
//method 2 this will not repeat the first max again and again scenario: 50, 45, 50, 20  output: 50, 45
		
		int big1=Integer.MIN_VALUE,index1=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(big1<arr[i])
			{
				big1=arr[i];				
				index1=i;
			}
		} 
		
		int big2=Integer.MIN_VALUE,index2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(big2<arr[i] && arr[i]!=big1)		
			{
				big2=arr[i];
				index2=i;
			}
		} 
		
		System.out.println("\nMaximum element in an array are: "+big1+" in "+index1+" index and "+big2+" in "+index2+" index");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_2BigNumbersInArray_without_sorting obj=new First_2BigNumbersInArray_without_sorting();
		obj.toGet_BigNumbers();
	}
}
