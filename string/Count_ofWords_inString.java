/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to count the words in string.
 */
public class Count_ofWords_inString {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public void to_countWords()
	{
		System.out.println("Enter string:");
		String str=sc.nextLine();
		System.out.println("\n"+str+"\n");
		int count=0;
		
//method 1:		
		System.out.println();
		for(int i=0;i<str.length();i++)
		{	
			
			if(str.charAt(i)>=32 && str.charAt(i)<=47 || str.charAt(i)>=58 && str.charAt(i)<=64 || str.charAt(i)>=91 && str.charAt(i)<=96 || str.charAt(i)>=123 && str.charAt(i)<=126 )		//to omit the count of space and comma or special characters.
			{
				continue;   //if special character comes then it skips so that if next of special character is space,comma,... it won't increase the count.
			}
			
			if(i==str.length()-1 || str.charAt(i+1)==' ' || str.charAt(i+1)==',' || str.charAt(i+1)=='"' || str.charAt(i+1)=='.')			//if the next character is space then the count of the first word will be printed.
				{
					count++;				//words ends with space,fullstop,",comma. =>checks with next word.
				}
		}
		
//		System.out.println("Count of words in \""+str+"\" is "+count);
//		System.out.println("Count of characters in \""+str+"\" is "+str.length());
		
		System.out.println("Total Count of words is :"+count);
		System.out.println("Total Count of characters is :"+str.length());
		
//method 2:
		
		System.out.println();
		String arr[]=str.split(" ");
		
		System.out.println("Count of words in \""+str+"\" is "+arr.length);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_ofWords_inString obj=new Count_ofWords_inString();
		obj.to_countWords();
	}

}
