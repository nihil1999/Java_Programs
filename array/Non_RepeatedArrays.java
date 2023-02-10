/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author logan
 *for finding the non-repeated elements in array.
 */
public class Non_RepeatedArrays {

	/**for assigning values to an array from the user.
	 * @param args
	 */
	
	public int[] to_assignValues(Scanner sc)
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
	
//to find the first non-repeated elements in an array
		public void to_find_first_nonrepeatedNumber(int[] arr) {
			
			System.out.println();
			
			int i,j;
			boolean check=false;
			for(i=0;i<arr.length;i++)		//for taking one number  i.e a[5]={1,2,3,2,1}  it first takes 1
			{
				for(j=0;j<arr.length;j++)		//for checking that number with other numbers 
				{
					if(i!=j && arr[i]==arr[j])		// i!=j becauz a[i]==a[j] i.e 1==1 so it becomes repeated element,
						break;							//only repeated elements will enter into this condition and breaks out of the loop.
				}
				
//if the number not enters the above condition i.e not repeated element then the j loop runs fully,
//therefore j value is 5 i.e when j becomes 5 the condition fails so it equals to the actual length of the array.
			if(j==arr.length)			
			{
					System.out.println("Non-repeated element in the array is "+arr[i]+" and the index is "+i);
					check=true;
					break;			//breaks after the first repeated element
				}
			}
			if(check==false)
				System.out.println("Array is full of repeated elements.");
			
//			boolean check=false;
//			int flag=0;
//			for(int i=0;i<arr.length;i++)
//			{
//				int count=0;
//				for(int j=i+1;j<arr.length;j++)
//				{	
//					if(arr[i]!=arr[j])
//					{
//						count++;
//						flag=1;
//					}
//				}
//				if(count==arr.length-1-i)
//				{
//					check=true;
//					System.out.println("The first non-repeated element is "+arr[i]);
//					break;
//				}
//				}
//			
//			if(flag==0)
//				System.out.println("Array is full of repeated elements.");
		}
		
		//for finding all the non-repeated elements in an array
		public void to_FindAll_nonRepeatedElements(int[] arr)
		{
			System.out.println();
			int count=0,flag=0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{	
					if(arr[i]!=arr[j])
					{
						count++;
						System.out.println("The "+count+" non-repeated element is "+arr[i]);
						flag=1;
						break;
					}
				}
			}
			if(flag==0)
				System.out.println("Array is full of repeated elements.");
		}
		
	//for displaying the array
		
		public void display(int a[])
		{
			System.out.println("\nDisplaying the array values: ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+ " ");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_RepeatedArrays obj=new Non_RepeatedArrays();
		Scanner sc=new Scanner(System.in);
		
		int a[]=obj.to_assignValues(sc);
		obj.to_find_first_nonrepeatedNumber(a);
	//	obj.to_FindAll_nonRepeatedElements(a);
		obj.display(a);
		
	}

}
