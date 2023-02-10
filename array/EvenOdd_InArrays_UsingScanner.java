package array;

import java.util.Scanner;

public class EvenOdd_InArrays_UsingScanner {

//for printing even numbers
	public void even() {
		
		System.out.println("Even number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int limit = sc.nextInt();
		System.out.println("Enter the starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int end = sc.nextInt();
		 sc.close();

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
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

//for printing odd numbers
	public void odd() {
		System.out.println("\nOdd number");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int limit = s.nextInt();
		System.out.println("Enter the starting number: ");
		int start = s.nextInt();
		System.out.println("Enter the ending number: ");
		int end = s.nextInt();
	//	s.close();

		int arr[] = new int[limit];
		for (int i = 0; i < arr.length; i++) {
			int j = start;
			for (; j <= end; j++) {
				if (j % 2 != 0) {
					arr[i] = j;
					start = j + 2;
					break;
				}
			}
		}

//to display the array values
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd_InArrays_UsingScanner obj = new EvenOdd_InArrays_UsingScanner();

		obj.even();
		obj.odd();
	}
}
