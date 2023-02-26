/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Palindrome_String {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);

//case sensitive
	public void toCheck_Palindrome()
	{
		System.out.println("Enter string:");
		String str=sc.nextLine();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		
		if(rev.equals(str))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");	
		
	}
	
	public void toCheck_Palindrome_Incase_Sensitive()
	{
		System.out.println("Enter string:");
		String str=sc.nextLine();
		String temp=str;
		temp=temp.toLowerCase();
		
		String rev="";
		
		for(int i=temp.length()-1;i>=0;i--)
		{
			rev+=temp.charAt(i);
		}
		
		if(rev.equals(temp))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");	
		
//method 2
		System.out.println("Enter string:");
		String str1=sc.nextLine();
		String rev1="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev1+=str1.charAt(i);
		}
		
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==rev1.charAt(i) || str1.charAt(i)==rev1.charAt(i)-32  ||  str1.charAt(i)==rev1.charAt(i)+32)
				count++;
		}
		
		if(count==str1.length())
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
		
		
		if(str1.equalsIgnoreCase(rev1))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome_String obj=new Palindrome_String();
		obj.toCheck_Palindrome();
		obj.toCheck_Palindrome_Incase_Sensitive();
	}

}
