/**
 * 
 */
package Patterns;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Numbers_pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int row=s.nextInt();
		System.out.println("Enter no of columns: ");
		int column=s.nextInt();
		
		for(int i=1;i<=row;i++)					// 1 4 7 10    => column index * row range + row index.
		{										// 2 5 8 11
			for(int j=0;j<column;j++)			// 3 6 9 12
			{
				System.out.print((j*row+i)+ " ");			//-> 0*3+1 =1 , 1*3+1=4 , 2*3+1=7, 3*3+1=10/ 0*3+2=2 ,  1*3+2=5, 2*3+2=8, 3*3+2=11/... 
			}
			System.out.println();
		}
//other method		
		System.out.println();
		for(int i=1;i<=row;i++)					// 1 4 7 10   row index+row range+ row range...1, 1+3=4, 4+3 =7 
		{										// 2 5 8 11
			int num=i;						    // 3 6 9 12
			for(int j=1;j<=column;j++)			
			{
				System.out.print(num+ " ");			
				num+=row;
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<row;i++)					//1 6 7 12     => even column 0,2 -> index * row range +row index+1 =>  1, 1+6=7 
		{										//2 5 8 11
			for(int j=0;j<column;j++)			//3 4 9 10
			{
				if(j%2==0)						//even column
				System.out.print((j*row+i+1)+ " ");		//->
				else if(j%2!=0)			//odd column
					System.out.print(((j+1)*row-i)+ " ");  // 2*row range - i
			}
			System.out.println();
		}

	}
}
