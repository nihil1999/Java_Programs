/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to rotate the single element in an array and store it in the same array
 *i.e 0th index value shifts to last and 0th index will have the value of 1st index value and the same goes on...
 */
public class RotationOf_SingleNumber_InSameArray {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	
	public void to_assignValues()
	{
		System.out.println("Enter the range");
		arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr[i]=sc.nextInt();											// 1 2 3 4 5 
		}
	}
	
	public void toRotate_Element()
	{
		int temp=arr[0];			//stored the 0th index value in temp so that it can be assigned to last index.
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)		//when i = 4 it enters into this block 
				arr[i]=temp;		// i=4 => value: a[0] i.e - 1.
			else
			arr[i]=arr[i+1];			//right side i+1 bcauz for 0th index -> 1st index value need to be assigned.	
			
		}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\n\n Array values ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotationOf_SingleNumber_InSameArray obj=new RotationOf_SingleNumber_InSameArray();
		obj.to_assignValues();
		obj.display();
		obj.toRotate_Element();
		obj.display();
	}

}
