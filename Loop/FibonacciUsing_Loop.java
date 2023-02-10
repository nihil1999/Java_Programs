package Loop;

import java.util.Scanner;

public class FibonacciUsing_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range=sc.nextInt();
//with third variable		
//		int firstnum=0,secondnum=1,thirdnum;
//		for(int i=1;i<=range;i++)
//		{
//			System.out.print(firstnum + " ");
//			thirdnum=firstnum+secondnum;
//			firstnum=secondnum;
//			secondnum=thirdnum;
//		}
		
//without third variable		
		int firstnum=0,secondnum=1,sum=0;
		for(int i=1;i<=range;i++)
		{
			sum+=firstnum;
			System.out.print(firstnum + " ");	//0  1  1
			secondnum=firstnum+secondnum;		//1	 2  3
			firstnum=secondnum-firstnum;		//1  1  2
		}
		System.out.println("\nTotal: " + secondnum);
	}

}
