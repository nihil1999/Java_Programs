/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to reverse words in a string.
 */
public class Reverse_words {

	/**
	 * @param args
	 */
	
	
	public void toReverse_words()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		
		String str[]=s.split(" ");
		
		String st="";
		
		for(int i=str.length-1;i>=0;i--)
		{
			st=st+str[i];
			st=st+" ";
		}
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_words obj=new Reverse_words();
		obj.toReverse_words();
	}

}
