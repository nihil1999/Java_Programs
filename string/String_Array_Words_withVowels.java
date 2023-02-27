/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class String_Array_Words_withVowels {

	/**
	 * @param args
	 */
	
	public void toFind_vowelWords()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		
		String str[]=s.split(" ");
		char ch[]= {'a','e','i','o','u','A','E','I','O','U'};
		
		String st[]=new String[str.length];

		int index=0;
		boolean flag=false;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				if(toCheck(str[i].charAt(j),ch))
					{
						st[index]=str[i];
						index++;
						flag=true;
						break;
					}
			}
		}
		
		for(int i=0;i<st.length;i++)
		{
			if(st[i]!=null)
			System.out.print(st[i]+" ");
		}
		if(flag==false)
		{
			System.out.println("No vowel words");
		}
	}
	
	private boolean toCheck(char searchChar,char[] ch) {
		// TODO Auto-generated method stub
		for(int i=0;i<ch.length;i++)
		{
			if(searchChar==ch[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Array_Words_withVowels obj=new String_Array_Words_withVowels();
		obj.toFind_vowelWords();
		obj.toFind_vowelWords2();
	}

//method 2:
	public void toFind_vowelWords2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		
		String str[]=s.split(" ");
		char ch[]= {'a','e','i','o','u','A','E','I','O','U'};
		
		String st="";

		int index=0;
		boolean flag=false;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				if(toCheck(str[i].charAt(j),ch))
					{
						st+=str[i]+" ";
						index++;
						flag=true;
						break;
					}
			}
		}
		String array[]=st.split(" ");
		
		if(flag==false)
		{
			System.out.println("No vowel words");
		}
		else {
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		}
		
	}

}
