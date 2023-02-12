/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *rotation of array in dynamic i.e user gives rotation limit.
 */
public class RotationOfArrays_dynamic {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	int num;
	
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
		System.out.println("\nEnter how many rotation: ");
		num=sc.nextInt();
		int temp,count=1;			
		
		while(count<=num) {		//it fails when count exceeds the rotation number. 
			
			temp=arr[0];			//after every rotation first value will be stored in temp.
			for(int i=0;i<arr.length;i++)
			{
				if(i==arr.length-1)		//when i = max it enters into this block 
					{
						arr[i]=temp;		// i=max => then the first value in temp will be assigned.
					}
				else
					arr[i]=arr[i+1];			//right side i+1 bcauz for 0th index -> 1st index value need to be assigned.	
			}
			count++;
		}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Array values ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotationOfArrays_dynamic obj=new RotationOfArrays_dynamic();
		obj.to_assignValues();
		obj.display();
		obj.toRotate_Element(); 
		System.out.print("\nAfter " +obj.num+ " rotation ");
		obj.display();
	}

}
