/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to count the character in words separately.
 */
public class CountOfCharacter_inString {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public void toCount_Character()
	{
		System.out.println("Enter string:");
		String str=sc.nextLine();
		System.out.println("Enter character to count:");
		char ch=sc.nextLine().charAt(0);
		int count=0,index=0;
		String s="";
		
//method 1:without converting to string array by split.
		System.out.println();
		for(int i=0;i<str.length();i++)
		{
			s=s+str.charAt(i);				//joining the character to a string.
			
			if(str.charAt(i)==ch)			
				count++;
			
			if(i==str.length()-1 || str.charAt(i+1)==' ' || str.charAt(i+1)==',')			//if the next character is space then the count of the first word will be printed.
				{
					
					System.out.println("Count of '"+ch+"' in \""+s+"\" is "+count);
					s="";
					count=0;
					i=i+1;
				}
		}
		
//using string array by split method.
		System.out.println();
		String arr[]=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			int count1=0;
			char c[]=arr[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(c[j]==ch)
					count1++;
			}
			System.out.println("Count of '"+ch+"' in \""+arr[i]+"\" is "+count1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfCharacter_inString obj=new CountOfCharacter_inString();
		obj.toCount_Character();
	}

}
