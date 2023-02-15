/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *to rotate a array values to right side.
 * array: 1 2 3 4 5    output : 5 1 2 3 4
 */
public class Rotation_ofArray_RigthSide {

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
		
		System.out.println("Array values ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
	
	public void toRotate_Element()
	{
		System.out.println("\nEnter how many rotation: ");
		num=sc.nextInt();										//rotation : 1   output: 5 1 2 3 4
																	
		int temp,count=1;			
		
		while(count<=num) {		//it fails when count exceeds the rotation number. 
			
			temp=arr[arr.length-1];			//after every rotation last index value will be stored in temp. // 5

//started from last becauz if index starts from first then the values will be reassigned.
// i=0 arr[0]=temp, i=1-> arr[1]=arr[0] which is 5 , i=2 -> arr[2]=arr[1] which is also 5	so this will not work.
			
			for(int i=arr.length-1;i>=0;i--)	// i=4 ... i=0
			{
				if(i==0)		//when i = 0 it enters into this block , it will come last.
					{
						arr[i]=temp;		// i=0 => then the last value in temp will be assigned. //arr[0]=temp ->5.
					}
				else							
					arr[i]=arr[i-1];			//right side i-1 bcauz for 4th index -> 3rd index value need to be assigned.  => arr[4]=arr[3]....	
			}
			count++;
		}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Array values after rigth shifting.");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotation_ofArray_RigthSide obj=new Rotation_ofArray_RigthSide();
		obj.to_assignValues();
		obj.toRotate_Element();
		obj.display();
	}

}
