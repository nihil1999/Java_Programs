/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to rotate the single element in an array and store it in new array
 * i.e 0th index value shifts to last and 0th index will have the value of 1st index value and the same goes on...
 */
public class RotationOfArray_Single {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr1[];
	int arr2[];
	int range;
	
	public void to_assignValues()
	{
		System.out.println("Enter the range");
	    range=sc.nextInt();			//length of 2 array will be equal.
		arr1=new int[range];
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr1[i]=sc.nextInt();											// 1 2 3 4 5 
		}
	}
	
	public void toRotate_Element()
	{
			arr2=new int[range];
//method 1:		
//		for(int i=0;i<arr2.length-1;i++)			//length-1 becauz last index value will be assigned in if block so if i=4 means then in the else block right side i becomes 5 so it will throw an error. 
//		{
//			if(i==0)    	
//				{
//					arr2[arr2.length-1]=arr1[i];	//if i=0 then its value shift to length-1 i.e last index 
//					arr2[i]=arr1[i+1];				//0 index will have i+1 value.
//				}
//			else						//other than 0th index will enter this block   1,2,3..
//				arr2[i]=arr1[i+1];		//right side i+1 bcauz for 1 index - 2 index value need to be assigned
//		}

//method 2:
			for(int i=0;i<arr2.length;i++) 
			{
				if(i==arr2.length-1)    		//when i = 4 it enters into this block 
						arr2[i]=arr1[0];			//	i=4 => value: a[0] i.e - 1.
				
				else		
					arr2[i]=arr1[i+1];		//right side i+1 bcauz for 0 index -> 1 index value need to be assigned
			}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\n\nUser given Array");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\n\nArray after rotation");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotationOfArray_Single obj=new RotationOfArray_Single();
		obj.to_assignValues();
		obj.toRotate_Element();
		obj.display();
	}

}
