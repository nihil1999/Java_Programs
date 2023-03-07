/**
 * 
 */
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Info {

	/**
	 * @param args
	 */

	public static void toGetInput() {
		Info obj = new Info();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = 0, b = 0;
		
		try 
		{
			a = sc.nextInt();
			b = sc.nextInt();
//			Program_Exception ob=(Program_Exception)obj;
			
			Object o=(Object)obj;
			Info ob=(Info)o;
			//System.out.println((Program_Exception)obj);		//class cast exception.
			System.out.println(ob);
		} 
		
		catch (InputMismatchException e) 
		{
			e = new InputMismatchException("input not valid.");
			System.out.println(e.getMessage());
			toGetInput();
		} 
		
		finally 
		{
			System.out.println("Program completed.");
			sc.close();
		}

		toAdd(a, b);
	}

	public static void toAdd(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toGetInput();
	}

}
