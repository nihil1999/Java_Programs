/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *to count the repeated elements in an array.
 */
public class CountOf_DuplicateElements_inArray {

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
	
	public void toCount_RepeatedNumbers()
	{
		System.out.println();
		int flag=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr1.length;j++)
			{	
				if(arr1[i]==arr1[j])		//same elements will enter into the condition.
				{
					count++;		
					flag=1;			//if the number repeats it becomes 1 else 0.
				}
			}
			if(count>0)			//non-repeated element willn't enter this block.
					System.out.println(arr1[i]+" is repeated "+count+" times.");
		}
		if(flag==0)			//if no number repeats then the flag will be 0.
			System.out.println("No repeated elements in an array.");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOf_DuplicateElements_inArray obj=new CountOf_DuplicateElements_inArray();
		obj.to_AssignValues();
		obj.toCount_RepeatedNumbers();
	}

}
