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
		
//method 1
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

//method 2
		System.out.println();
		for(int i=1;i<=row;i++)					//1 6 7 12     => even column 2,4 -> column index * row range -row index+1 =>  (2*3)-1+1=6, (4*3)-1+1=7 
		{										//2 5 8 11
			for(int j=1;j<=column;j++)			//3 4 9 10
			{
				if(j%2==0)						//even column
				System.out.print((j*row-i+1)+ " ");		//-> 2nd col -> i know col index * row range gives 6 but for next row it is decreasing so if subtract with row index then first will be 5 so i added 1. 
				else 							//odd column
					System.out.print(j*row-row+i+ " ");  // 1*row range - row+i -> for 1st column if i give row index then it will come but for 3rd column its varying so column index *row length and subtract it with row length and increases by 1 to get 1.... 
			}
			System.out.println();
		}

//method 3
		System.out.println();
		int index=1;							//note: if 3 rows then first 3 odd numbers... if 5 rows then first 5 odd numbers.
		for(int i=1;i<=row;i++)					//1 6 7 12     => 1 , 1 + 5 = 6, 6 + 1 = 7, 7 + 5 = 12  => common: row index   5  1  5   even column -> depends on the row range and their odd numbers are decreasing like: for 4 rows 4 odd numbers -> 7, 5, 3, 1   
		{										//2 5 8 11	   => 2 , 2 + 3 = 5, 5 + 3 = 8, 8 + 3 = 11			   row index   3  3  3   odd column  -> odd numbers in increasing order 1, 3, 5, 7 
												//3 4 9 10     => 3 , 3 + 1 = 4, 4 + 5 = 9, 9 + 1 = 10			   row index   1  5	 1
			int num=i;				//first column is row index, so i assigned row index.
			int num2=2*row-index;	//to get odd numbers first it will be 5. index initially is 1 then increases by 2 to move to next odd number 3...
			
			for(int j=1;j<=column;j++)			
			{
				System.out.print(num+" ");		//first num will be printed to get 1st column.
				if(j%2==0)					//if the current column index is even then the next odd index should increased with the odd numbers like: 1, 3, 5 ... 
					num=num+index;			//so here i added the number with index becauz index starts with 1 and increases by 2.
				
				else						//if the current column index is odd then the next even index will be adding the num with decreasing of odd numbers 5, 3, 1
					num=num+num2;			//so here i added the number with num2 becauz the num2 first have 5 and then decreases by 2 consequently after inner loop completes...
			}
			System.out.println();
			index+=2;				//to increase the odd number
		}

	}
}
