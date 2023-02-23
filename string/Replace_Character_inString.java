/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Replace_Character_inString {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public void toReplace_Character()
	{
		System.out.println("Enter string:");
		String str=sc.nextLine();
		System.out.println("Enter character to replace:");
		char ch=sc.nextLine().charAt(0);
		
		String arr[]=str.split(" ");
		String s="";
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length();j++)
			{
				if(j==0)
					s=s+(char)(arr[i].charAt(j)-32);
				else
					s=s+arr[i].charAt(j);
			}			
		}
		
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replace_Character_inString obj=new Replace_Character_inString();
		obj.toReplace_Character();
		System.out.println("hai"+' '+"hai");
		
	}

}
