/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *shifting array elements i.e left to right and vice-versa.
 *we need to shift left side of middle element to right and vice-versa.
 */
public class Shifting_Array_Elements {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
	int arr2[];
	
	public void to_AssignValues() {
		//for assigning 1st array from user.
				System.out.println("Enter the range for 1st array: ");
				arr1 = new int[sc.nextInt()];

				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Enter the value for " + i + " index: ");
					arr1[i] = sc.nextInt(); // 1 2 3 4 5
				}
				
				System.out.println("\nDisplaying the array values: ");
				for(int i=0;i<arr1.length;i++)
				{
					System.out.print(arr1[i]+ " ");
				}
	}

//to shift in the same array.
	public void to_shiftArray()
	{
		int mid=arr1.length/2;		//to get center element in an array.
		int temp;
		
		for(int i=0;i<=mid;i++)		//loop limit is middle element. 
		{
			if(arr1.length%2!=0)	//if the range is odd then enters into this block
				{
					if(i!=mid)		//if index is not equal to middle number then enters into this block becauz we need to shift left side of middle element to right and vice-versa.
						{
							temp=arr1[i];		//first i stored the left values in temp one by one according to loop.
							arr1[i]=arr1[mid+i+1];	//and then i assigned right side values to left side one by one.
							arr1[mid+i+1]=temp;		//lastly i assigned left side values to right side index. 
						}
				}			//middle element remains the same bacuz i didn't reassign it anywhere.
			
			else
			{
				if(i!=mid && i!=mid-1)		//for even range. i.e index - 0 1 2 3 4 5  => middle number is 2 and 3. if index is not equal to this then enters into this block.
				{
					temp=arr1[i];
					arr1[i]=arr1[mid+i+1];
					arr1[mid+i+1]=temp;
				}
			}	
		}	
	}

//to shift in new array.
	public void to_shiftElement_inNewArray()
	{
		arr2=new int[arr1.length];
		int mid=arr1.length/2;
		
		for(int i=0;i<arr1.length;i++)			// 0 1 2 3 4 5
		{
			if(arr1.length%2==0 ) 	//for even range
			{
				if(i==mid || i==mid-1)
					arr2[i]=arr1[i];
				else if(i<mid)		   //if  i less than middle element then right side value will be assigned
				{
					arr2[i]=arr1[mid+i+1];		// mid+i+1 = 3+0+1 => 4 ... -> when i starts with 0 it should have the right side value i.e after middle element...
				}
				else 			//if i greater than middle element 
				{
					arr2[i]=arr1[i-mid-1];		//i-mid-1 = 4-3-1 => 0 .... -> when i is greater than middle element then it should have left side values.
				}
			}
			
			else			//for odd range
			{
				if(i<mid)
				{
					arr2[i]=arr1[mid+i+1];
				}
				else if(i>mid)
				{
					arr2[i]=arr1[i-mid-1];
				}
				else
					arr2[i]=arr1[i];
			}
				
		}
		
		System.out.println("\n\nDisplaying the array values after shifting in new array: \n");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ " ");
		}
	}
	
	public void display()
	{
		System.out.println("\n\nDisplaying the array values after shifting: \n");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shifting_Array_Elements obj=new Shifting_Array_Elements();
		obj.to_AssignValues();
		obj.to_shiftElement_inNewArray();	//need to call this first bcauz if we call shiftarray method then the arr1 value will be reassigned. 
		obj.to_shiftArray();
		obj.display();
	}

}
