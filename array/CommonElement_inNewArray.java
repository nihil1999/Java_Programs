/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to store the common elements of two array in new array.
 */
public class CommonElement_inNewArray {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr1[];
	int arr2[];
	int b[];
	int count;
	boolean check=false;
	
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
			arr2[i]=sc.nextInt();										// 2 4 1 9	
		}
		
	}
	
	public void to_findRepeatedElements()
	{
		count=0; 
		for(int i=0;i<arr1.length;i++)		// i=0  0  0        1       2  2 ...        3   3 ....
		{
			for(int j=0;j<arr2.length;j++)	// j=0  1  2        0       0  1 ...        0   1 .....
			{
				if(arr1[i]==arr2[j])		//	1!=2 1!=4 1==1   2==2   3!=2  3!=4 ...   4!=1   4==4
					{
						count++;      //to find how many repeated elements so that we can assign the length of new array. count=1 count=2 count=3;
						break;
					}
			}
		}
		System.out.println("Repeated elements count: "+ count);
	}
	
	public void printArray_OfCommonElements()
	{
		int range=count;
		b=new int[range];			//b array size is = count.  i.e  3;
		int j,index=0;				//index=0 becauz new array starts with 0.
		for(int i=0;i<arr1.length;i++)
		{
			int c=0;					//to count starts with 0.
			for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					c++;				// c becomes 1 when element repeats.
					break;	
				}
			}
			if(c==1)			//if c=1 then the element is repeated
			{
				b[index]=arr1[i];
				index++;
				check=true;		//if no elements repeats then it is false.
			}
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
		
		if(check==true) {
		System.out.println("\n\nDisplaying the array values of common elements 2 arrays: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+ " ");
		}
		}
		else
			System.out.println("\n\nThere are no common elements.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonElement_inNewArray obj=new CommonElement_inNewArray();
		obj.to_AssignValues();
		obj.to_findRepeatedElements();
		obj.printArray_OfCommonElements();
		obj.display();
	}

}
