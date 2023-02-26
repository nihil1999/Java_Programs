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
	int arr2[];
	
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
				System.out.println();
				
	}
	
	public void toCount_RepeatedNumbers()
	{	
		int fullcount=0;		//to know the repeated elements count.
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{	
				if(arr1[i]==arr1[j])		//same elements will enter into the condition.
				{
					fullcount++;
					break;
				}
			}
		}
		
		//System.out.println(fullcount);
		
		arr2=new int[fullcount];		//2nd array created where length is fullcount i.e. count of repeated elements. 
		
		System.out.println();
		int flag=0,index=0;
		
		for(int i=0;i<arr1.length;i++)		//to holds one number and check with other numbers.
		{
			int tocount=0;
			int count=0;
			int check=0;
			
			while(tocount<index)		//to check the repeated elements if the repeated number enters again then it needs to be skipped so i used variable check to identify.
			{
				if(i!=0 && arr1[i]==arr2[tocount])	//i!=0 -> becauz arr2 contains 0 at starting.
					check=1;	
				tocount++;
			}
			
			for(int j=i+1;j<arr1.length;j++)
			{	
				if(check==1)
					break;
				if(arr1[i]==arr1[j])		//same elements will enter into the condition.
				{
					count++;		
					flag=1;			//if the number repeats it becomes 1 else 0.
				}
			}
			if(count>0)			//non-repeated element willn't enter this block.
					{
						System.out.println(arr1[i]+" is repeated "+count+" times.");
						arr2[index]=arr1[i];
						index++;
					}
		}
		if(flag==0)			//if no number repeats then the flag will be 0.
			System.out.println("No repeated elements in an array.");	
	}
	
	public void display()
	{
		System.out.println("\nArray after storing repeated elements \n");
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
			}
			System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOf_DuplicateElements_inArray obj=new CountOf_DuplicateElements_inArray();
		obj.to_AssignValues();
		obj.toCount_RepeatedNumbers();
		obj.display();
		obj.sc.close();
	}

}
