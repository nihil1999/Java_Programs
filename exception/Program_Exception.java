/**
 * 
 */
package exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Program_Exception extends Info {

	/**
	 * @param args
	 */
	
	public static void toGetInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter 2 numbers: ");

		int a=0,b=0,c=0;
		int arr[]=new int[10];
		String str="hai";
		int arr2[];
		
		Random r=new Random();
		
		try {
			
			a=sc.nextInt();		//for inputmismatch exception
			b=sc.nextInt();
			
			c=a/b;				//for arithmetic exception
			
			//arr2=new int[-5];		//for negative array size exception
			
			//System.out.println(arr[5]);		//for index out of bound exception
			
			//System.out.println(str.charAt(2));	//for string index out of bound exception
			
			try 
			{
	
					//str=null;					
					
					System.out.println(str.charAt(0));		//for null pointer exception
					
					str="123";
					
					Integer.parseInt(str);			//for number format exception.
					
					r.nextInt(5);				//Illegal Argument exception
					

			}
			
			catch(NullPointerException e)
			{
				e=new NullPointerException("String is null, please give some value.");
				System.out.println(e.getMessage());
				//toGetInput();
			}
			
			catch(IllegalArgumentException e)
			{
				e=new IllegalArgumentException("Value must be positive.");
				System.out.println(e.getMessage());
				//toGetInput();
			}			
		}
		
		catch(InputMismatchException e)
		{
			e=new InputMismatchException("input not valid.");
			System.out.println(e.getMessage());
			toGetInput();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			//toGetInput();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e=new ArrayIndexOutOfBoundsException("Array index out of bound for length");
			System.out.println(e.getMessage());
			
			//toGetInput();
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			//e=new StringIndexOutOfBoundsException("String index out of bound for length");
			System.out.println(e.getMessage());
			//toGetInput();
		}
		
		
		
		catch(NumberFormatException e)
		{
			e=new NumberFormatException("Given string \""+str+"\" can't be able to convert to integer.");
			System.out.println(e.getMessage());
			//toGetInput();
		}
		
		catch(NegativeArraySizeException e)
		{
			e=new NegativeArraySizeException("Given array size is invalid, it should be a positive integer.");
			System.out.println(e.getMessage());
			//toGetInput();
		}
		
		catch(Exception e)
		{
			//e=new NumberFormatException("Given string \""+str+"\" can't be able to convert to integer.");
			System.out.println(e.getMessage());
			//toGetInput();
		}
		
		finally {
			System.out.println("Program completed.");
			sc.close();
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program_Exception obj=new Program_Exception();
		toGetInput();
	}

}
