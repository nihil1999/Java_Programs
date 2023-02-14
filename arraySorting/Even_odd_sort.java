/**
 * 
 */
package arraySorting;

import java.util.Scanner;

/**
 * @author logan
 *to sort even and odd element in an array separately and join them in ascending order of even and odd.
 * 1 3 4 2 8 10 7 9  output -> 2 4 8 10 1 2 3 7 9
 */
public class Even_odd_sort {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	int arr1[];
	int arr2[];

	public void to_assignValues() {
		System.out.println("Enter the range");
		arr1 = new int[sc.nextInt()];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the value for " + i + " index: ");
			arr1[i] = sc.nextInt();
		}
	}
	
	public void sort_Evenodd()				// 8 9 5 2 3 6 1 4 7 
	{
		int index=0;
		arr2=new int[arr1.length];

// for storing even numbers first. if i gave else part here i.e(for odd) then the array will be same as original. 
		for (int i = 0; i < arr1.length; i++) {		
			if(arr1[i]%2==0)					//only even elements will enter  
			{
				arr2[index]=arr1[i];			//even elements will be assigned to a new array in a consecutive order.
				index++;
			}						
		}								// 8 2 6 4 0 0 0 0 0 
		
		//to check if even numbers assigned in consecutive order. 
//		System.out.println("\nArray values after sorting ");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}

// for storing odd numbers second.
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]%2!=0)				//only odd elements will enter
				{
				arr2[index]=arr1[i];		//odd elements will be assigned to a newly created array in a consecutive order of first assigned even numbers .
				index++;
				}						// 8 2 6 4 9 5 3 1 7
		}
		
		//to check if even numbers and odd numbers assigned in consecutive order.
//		System.out.println("\nArray values after sorting ");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}

//for arranging even numbers and odd numbers in ascending order by separately. 
		int min;
		
		for (int i = 0; i < arr2.length; i++) {		//takes first number and checks with next numbers
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]%2==0 && arr2[j]%2==0)		//if numbers is even then it enters into this block,first even numbers enter into this block becauz i have separated even and odd numbers.  
				{									//arr2[j]%2==0 becauz j is i+1 so the last even number checks with first odd number and i don't want that to happen.								 
					if(arr2[i]>arr2[j])			// if the first number is greater than the next number then it will shift their places
					{
						min=arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=min;
					}							
				}
				else if(arr2[i]%2!=0)		//if numbers is odd then it enters into this block,
				{
					if(arr2[i]>arr2[j])		// if the first number is greater than the next number then it will shift their places
					{
						min=arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=min;
					}
				}		
			}
		}
	}
	
	public void display()
	{
		System.out.println("\nArray values ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\n\nDisplaying the array values after sorting in even and odd: ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even_odd_sort obj=new Even_odd_sort();
		obj.to_assignValues();
		obj.sort_Evenodd();
		obj.display();
	}

}
