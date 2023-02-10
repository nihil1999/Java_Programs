package array;

import java.util.Scanner;

public class Even_Odd_Choice {
	
	public void even_odd()
	{
		System.out.println("1 - even number");
		System.out.println("2 - odd number");
		System.out.println("Enter your choice");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		
		int limit;
		int start;
		int end;
		
		//int arr[] = new int[limit];
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the range: ");
		     limit = s.nextInt();
			System.out.println("Enter the starting number: ");
			 start = s.nextInt();
			System.out.println("Enter the ending number: ");
		     end = s.nextInt();
			
			int arr[] = new int[limit];
			for (int i = 0; i < arr.length; i++) {
				int j = start;
				for (; j <= end; j++) {
					if (j % 2 == 0) {
						arr[i] = j;
						start = j + 2;
						break;
					}
				}
			}
			
//to display the array values
			System.out.println("Even numbers");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			System.out.println();
			break;
		case 2:
			System.out.println("Enter the range: ");
		     limit = s.nextInt();
			System.out.println("Enter the starting number: ");
			 start = s.nextInt();
			System.out.println("Enter the ending number: ");
		     end = s.nextInt();
		     
		     int arr1[] = new int[limit];
		     
			for (int i = 0; i < arr1.length; i++) {
				int j = start;
				for (; j <= end; j++) {
					if (j % 2 != 0) {
						arr1[i] = j;
						start = j + 2;
						break;
					}
				}
			}
			//to display the array values
			System.out.println();
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}

			System.out.println();
			break;
		default:
				System.out.println("Enter valid choice");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even_Odd_Choice obj=new Even_Odd_Choice();
		
		obj.even_odd();
	}

}
