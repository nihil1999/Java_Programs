/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *to print the values in between of an adjacent elements.
 * array: 1 5 10 5
 * output: 1-5 => (2 3 4),  5-10=> (6 7 8 9 ), 10-5=> (6 7 8 9)
 */
public class Print_AdjacentElement_inArray {

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
	
	public void toPrint_AdjacentElement()
	{
		System.out.println("\nValues between Adjacent elements ");
		int num1,num2;
		System.out.println("\n");
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]<arr1[i+1])			//if the first number is less than the next number then it enters into this block.
			{
				num1=arr1[i]+1;				//here i stored the first element in variable and increased by 1 because i want to print the numbers in between. 
				while(num1<arr1[i+1])		//then the value between two numbers need to be printed so i have given condition if the num is equal to next index number then loop breaks.
				{
					System.out.print(num1 + " ");
					num1=num1+1;			//increases the number by one so that consecutive value will be printed.
				}
			}
			else							//if the first number is greater than the next number then it enters into this block.
			{
				num2=arr1[i+1]+1;			//here i stored the smallest number in a variable so that in between values will be printed in ascending order. 
				while(num2<arr1[i])
				{
					System.out.print(num2 + " ");
					num2+=1;
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_AdjacentElement_inArray obj=new Print_AdjacentElement_inArray();
		obj.to_AssignValues();
		obj.toPrint_AdjacentElement();
	}

}
