/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to rotate the first two element in an array and store it in the same array
 *i.e 0th index value shifts to second last and 1st index value shifts to last index now in 0th index will have the value of 2nd index value and the same goes on...
 */
public class DoubleRotation_inSameArray {

	/**
	 * @param args
	 * 
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
	
	public void toRotate_DoubleElement()
	{
		int temp=arr[0];			//stored the 0th index value in temp so that it can be assigned to second last index. i.e -> 1
		int temp2=arr[1];			//stored the 1st index value in temp2 so that it can be assigned to last index. i.e. -> 2
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)		//when i = 4 it enters into this block 
				arr[i]=temp2;		// i=4 => value: a[1] i.e -> 2.
			else if(i==arr.length-2)	//when i = 3 it enters into this block 
				arr[i]=temp;		// i=3 => value: a[0] i.e -> 1.
			else
			arr[i]=arr[i+2];			//right side i+2 bcauz for 0th index -> 2nd index value need to be assigned.	
			
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
		DoubleRotation_inSameArray obj=new DoubleRotation_inSameArray();
		obj.to_assignValues();
		obj.display();
		obj.toRotate_DoubleElement();
		obj.display();
	}

}
