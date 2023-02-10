package array;

import java.util.Scanner;
//adding the same index values of different arrays and assigning it to new array.
public class Four_Arrays {
	
	public void assign_array(int range, Scanner s)
	{
		int a[]=new int[range];
		int b[]=new int[range];
		int c[]=new int[range];
		int d[]=new int[range];
		
		for(int i=0;i<range;i++)
		{
			System.out.println("Enter the value for " +i+" index in 1st array.");
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<range;i++)
		{
			System.out.println("Enter the value for " +i+" index in 2nd array.");
			b[i]=s.nextInt();
		}
		
		for(int i=0;i<range;i++)
		{
			System.out.println("Enter the value for " +i+" index in 3rd array.");
			c[i]=s.nextInt();
		}
		
		display(a,b,c,d);
		add_arrays(a,b,c,d);
		display(a,b,c,d);
	}

	public void add_arrays(int[] a, int[] b, int[] c, int[] d) {
		// TODO Auto-generated method stub
//adding all array values and assigning it to new array.
		System.out.println();
		for(int i=0;i<d.length;i++)
		{
			d[i]=a[i]+b[i]+c[i];
		}
		
		System.out.println("Sum of 3 arrays in 1 array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(d[i] + " ");
		}
	}

	public void display(int[] a, int[] b, int[] c,int[] d) {
		// TODO Auto-generated method stub
		System.out.println("\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] + " ");
		}
		System.out.println();
		
//		for(int i=0;i<d.length;i++)
//		{
//			System.out.print(d[i] + " ");
//		}
//		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four_Arrays obj=new Four_Arrays();
		System.out.println("Enter the range: ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		
		obj.assign_array(range,sc);
	}

}
