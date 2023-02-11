/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *To print the numbers if multiply of 2 elements in an array equals to given number.
 */
public class MultiplyEquals_toNumber {

	/**for assigning values to an array from the user.
	 * @param args
	 */
	
	public int[] to_AssignValues(Scanner sc)
	{
		System.out.println("Enter the range");
		int arr[]=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value for "+i+" index: ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}

//to check if multiply of 2 elements in an array equals to given number.
	public void toCheck_multiplyOfTwo_NumbersEquals_toGivenNumber(int[] arr,Scanner sc)
	{
		System.out.println("\nEnter the number to check: ");
		int num=sc.nextInt();		//for getting the number from user.  for eg: 10
		boolean check=false;
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]*arr[j]==num)		// for eg: 1*10=10 
				{
					check=true;
					System.out.println("The multiply of index "+ i +" and " + j +" values are "+arr[i]+ " x " + arr[j]+" is equal to given number "+num);
				}
			}
		}
		if(check==false)
			System.out.println("\nMultiply of 2 elements in an array is not equal to given number.");
	}

//for displaying the array
	public void display(int a[])
	{
		System.out.println("\nDisplaying the array values: \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyEquals_toNumber obj=new MultiplyEquals_toNumber();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_AssignValues(sc);
		obj.toCheck_multiplyOfTwo_NumbersEquals_toGivenNumber(a, sc);
		obj.display(a);	
	}

}
