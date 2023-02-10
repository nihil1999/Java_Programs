/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class MiddleElement_InArray {

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
	
	public void to_printMiddleElement_inArray()
	{
		int mid=arr.length/2;
		for(int i=0;i<arr.length;i++)
		{
			if((arr.length%2)!=0 && i==mid)
				System.out.println("Middle element in an array is: "+arr[i] + " and index is: "+i);
			if((arr.length%2)==0 ) {
				if(i==mid || i==mid-1)
				System.out.println("Middle element in an array is: "+arr[i] + " and index is: "+i);
			}
		}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\n\nArray values\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleElement_InArray obj=new MiddleElement_InArray();
		obj.to_assignValues();
		obj.display();
		obj.to_printMiddleElement_inArray();
		
	}

}
