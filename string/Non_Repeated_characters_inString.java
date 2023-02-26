/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to print the last non-repeated character.
 */
public class Non_Repeated_characters_inString {

	/**
	 * @param args
	 */

	
	public void toFind_first_nonRepeatedCharacter()
	{
		System.out.println("\n-------------This is to print first non-repeated character of a string.------------------\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
		String str=s.toLowerCase();
		
		System.out.println("\nThe string is \""+s+"\"\n");
		boolean flag;
		
		for(int i=0;i<str.length();i++)
		{
			flag=false;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					flag=true;
			}
			if(flag==false)
				{
					System.out.println("First non repeated character in a string is '"+s.charAt(i)+"'.");
					break;
				}	
		}
	}
	
	
	public void toCount_non_repeated_characters()
	{
		System.out.println("\n-------------This is to count the non-repeated characters of a string.------------------\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
		String str=s.toLowerCase();
		
		System.out.println("\nThe string is \""+s+"\"\n");
		boolean flag;
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			flag=false;
			for(int j=0;j<str.length();j++)				//starting with 0 bcauz if gave i+1 then for e.g. last repeated character will be checking with next to that characters not before so it'll print as a non-repeated character.
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
					flag=true;
			}
			if(flag==false)				//by the completion of inner loop if the character repeats then flag will be true, else it stays false.
				{
					System.out.println("Non repeated character in a string is '"+s.charAt(i)+"'.");
					count++;
				}	
		}
		System.out.println("\nThe count of non-repeated characters in a string \""+s+"\" is: "+count);
	}
	
	public void toFind_Last_nonRepeatedCharacter()
	{
		System.out.println("\n-------------This is to print last non-repeated character of a string.------------------\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		
		String str=s.toLowerCase();
		char ch=' ';
		
		System.out.println("\nThe string is \""+s+"\"\n");
		boolean flag;
//method 1:		
		for(int i=0;i<str.length();i++)
		{
			flag=false;
			if(str.charAt(i)!=' ') {
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				ch=str.charAt(i);
			}
			}
		}
		System.out.println("Last non repeated character in a string is '"+ch+"'.");
		
//method 2:
		boolean flager;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			flager=false;
			if(str.charAt(i)!=' ')
			{
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
					flager=true;
			}
			if(flager==false)
				{
					System.out.println("Last non repeated character in a string is '"+s.charAt(i)+"'.");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_Repeated_characters_inString obj=new Non_Repeated_characters_inString();
		//obj.toFind_first_nonRepeatedCharacter();
		//obj.toCount_non_repeated_characters();
		obj.toFind_Last_nonRepeatedCharacter();
	}

}
