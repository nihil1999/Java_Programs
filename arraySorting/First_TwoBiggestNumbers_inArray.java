/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *to find the n number of largest numbers in array. 
 */
public class First_TwoBiggestNumbers_inArray {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
	
	public void to_AssignValues() {
//for assigning 1st array from user.
				System.out.println("Enter the range for array: ");
				arr1 = new int[sc.nextInt()];

				for (int i = 0; i < arr1.length; i++) {
					System.out.println("Enter the value for " + i + " index: ");
					arr1[i] = sc.nextInt(); 
				}
				
//for display user given array
				System.out.println("\nArray values ");
				for(int i=0;i<arr1.length;i++)
				{
					System.out.print(arr1[i] + " ");
				}
				
	}
	
	public void tofind_TwoGreatestNumber()
	{
		int max;
		System.out.println("\n\nEnter how many greatest number to find: ");
		int num=sc.nextInt();
		System.out.println();
		
		for(int i=0;i<arr1.length;i++)		//after the first loop 0th index will contain 1st greatest number and goes on. 
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					max=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=max;
				}
			}
			if(i<num)			//till the given number.
			{
				System.out.println((i+1)+ " greatest number is "+arr1[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_TwoBiggestNumbers_inArray obj=new First_TwoBiggestNumbers_inArray();
		obj.to_AssignValues();
		obj.tofind_TwoGreatestNumber();
	}

}
