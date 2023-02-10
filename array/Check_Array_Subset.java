package array;

import java.util.Scanner;

//to check if an array is subset of another array.
public class Check_Array_Subset {

	public void assign_array(int[] arr1, int[] arr2) {
		Scanner scan = new Scanner(System.in);
//assigning values for first array.

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the " + i + " index number for 1st array: ");
			arr1[i] = scan.nextInt();
		}

//assigning values for second array.	

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Enter the " + i + " index number for 2nd array: ");
			arr2[i] = scan.nextInt();
		}
	}

	public void display_arrays(int[] a, int[] b) {
		System.out.println();
//for displaying 1st array.
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
//for displaying 2nd array.
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}

//to check if the array is a subset of another array.
	public void check_array_subset(int[] arr1, int arr2[]) {
		int flag = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j])
					flag++;
			}
		}
		
		String max,min;
		if(arr1.length<arr2.length) {
			 max="arr2";
			 min="arr1";
		}
		else {
			max="arr1";
			min="arr2";
		}
		
		System.out.println();
		if (flag == arr2.length || flag == arr1.length)		//subset can be first or second so using or.
			System.out.println( min+" is a subset of "+ max + " array. ");
		else
			System.out.println( min + " is not a subset of "+ max + " array. ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check_Array_Subset obj = new Check_Array_Subset();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for 1st array.");
		int arr1[] = new int[sc.nextInt()];
		System.out.println("Enter the range for 2nd array.");
		int arr2[] = new int[sc.nextInt()];

		obj.assign_array(arr1, arr2);
		obj.display_arrays(arr1, arr2);
		obj.check_array_subset(arr1, arr2);
	}

}
