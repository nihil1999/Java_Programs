package Recursion;
// print numbers in ascending and descending order using recursion without using loop. 
import java.util.Scanner;

public class PrintNumbers_Recursion {
	
	public void add(int num,int org)
	{
//print from 1 to 5.
		
		//System.out.println("number " + num);		//to check if the number is decreasing
		int result=0;
		if(num>0) {
		//	System.out.println("result: " + result);		//to check if the result is starting at zero.
			result=org-(num-1);
		System.out.println(result);
		add(num-1,org);
		
//		//System.out.println(num);		//print from 1 to 5 without subtracting the number cauz it'll print when the last method completes and follows.
		}
//		//else						//print only to the last recursive method.
//		//	System.out.println(num);  	//if else wasn't given it'll print to all the recursive method in increasing order i.e. 0 to num.
	
	}
		
//print from 5 to 1
	
	public void add(int num) 
	{
		if(num>0) {
		System.out.println(num);
		add(num-1);
		}
	}

//print from 1 to 5
	
	public int toPrint(int num)      //num 5, num 4, num 3, num 2, num 1, num 0
	{
		if(num>0)
		{
			int value=toPrint(num-1);			//this will call the method again and again until num becomes 0 when num is 0 it'll return 1. 
			System.out.println(value);			//last method prints first i.e. 1,2,3...
			return num+1;						//when num is 0 it returns 1 then it adds by 1 and return it to the method that called and goes on.
		}
		else
			return 1;					//when num is 0 if condition fails and it returns 1 to num 1 method.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers_Recursion obj=new PrintNumbers_Recursion();
		
		Scanner s=new Scanner(System.in);				//scanner class to get input from console.
		System.out.println("Enter the number: ");
		int original=s.nextInt();
		
		System.out.println("Print from 1 to number: ");
		obj.add(original,original);
		
		System.out.println("\nPrint from number to 1: ");
		obj.add(original);
		
		System.out.println("\nPrint from 1 to number without subtracting : ");
		obj.toPrint(original);
	}

}
