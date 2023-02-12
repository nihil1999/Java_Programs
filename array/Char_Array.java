/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to print the characters in array.
 *if we give numbers in array then corresponding ASCII value will be assigned in new array by typecasting.
 */
public class Char_Array {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	char arr1[];
	char arr2[];
	
	public void to_assignValues()
	{
		System.out.println("Enter the range");
		arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr[i]=sc.nextInt();											 
		}
		
		System.out.println("Enter the range");
		arr2=new char[sc.nextInt()];
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr2[i]=(char)sc.nextInt();											 
		}
	}
	
	
	public void toChar()
	{
		arr1=new char[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=(char)arr[i];										 
		}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\nArray values ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\nArray values of characters ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\n\nArray values of characters 2 ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Char_Array obj=new Char_Array();
		obj.to_assignValues();
		obj.toChar();
		obj.display();
	}

}
