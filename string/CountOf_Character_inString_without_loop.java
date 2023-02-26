/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to count the character in a string without using loop
 */
public class CountOf_Character_inString_without_loop {

	/**
	 * @param args
	 */
	
	int count=0;
	
	public int toCount(char x,int fromindex,String str)
	{
		int index=str.indexOf(x, fromindex);		//if the character presents then it returns the index else it returns -1.
		if(index==-1)							//if the given character not presents in string then it returns the last count.
			return count;
		else
		{
			count++;				//count increases if the character presents 
			return toCount(x,index+1,str);		//here using recursion to check if character presents afterwards -> index+1 : becauz if i give index then it'll creating a loop bcauz i m searching in the same index that has the character. 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOf_Character_inString_without_loop obj=new CountOf_Character_inString_without_loop();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		String str=s.toLowerCase();
		
		System.out.println("Enter the character to check");
		char ch=sc.next().charAt(0);
		char c=ch;
		
		if(ch>='A' && ch<='Z')
			c=(char)(ch+32);
		
		int numbers=obj.toCount(c, 0,str.toLowerCase());
		
		System.out.println("The count of given character '"+ch+"' in \""+s+"\" is: "+numbers);
	}
}
