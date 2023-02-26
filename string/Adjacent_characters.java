/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to print the adjacent characters i.e mom => //output -> o : before and after character are equal.
 */
public class Adjacent_characters {

	/**
	 * @param args
	 */
	
	public void toFind_adjacent_character()
	{
		System.out.println("\n-------------This is to find adjacent character in a string.------------------\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
		String str=s.toLowerCase();
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
				if(i!=0 && i!=str.length()-1 && str.charAt(i-1)==str.charAt(i+1))
					{
						System.out.println("Adjacent character is '"+str.charAt(i)+"'");
						flag=true;
					}
		}
		if(flag==false)
			System.out.println("No adjacent characters");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adjacent_characters obj=new Adjacent_characters();
		obj.toFind_adjacent_character();
	}

}
