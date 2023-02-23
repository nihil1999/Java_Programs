/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *
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
		String arr[]=str.split(" ");
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				count++;
			if(i==str.length()-1 || str.charAt(i+1)==' ')
				{
					System.out.println("Count of '"+ch+"' in \""+arr[index]+"\" is "+count);
					count=0;
					index++;
				}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfCharacter_inString obj=new CountOfCharacter_inString();
		obj.toCount_Character();
	}

}
