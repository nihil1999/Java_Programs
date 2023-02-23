/**
 * 
 */
package string;

/**
 * @author logan
 *
 */
public class String_Workspace {

	/**
	 * @param args
	 */
	
	public void toCount_character()
	{
		String str="Hai, welcome to sample workspace";
		char check_char='a';
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==check_char)
				count++;
		}
		
		System.out.println("The count of given character '"+check_char+"' is "+count);
		
		char c[]=str.toCharArray();
		int count1=0;
		
		for(char i:c)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==check_char)
				count1++;
		}
		
		System.out.println("The count of given character '"+check_char+"' is "+count1);	
	}
	
	public void toCount_Vowels()
	{
		String str="HAI, WELCOME to sample workspace checking VOWELS.";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'|| str.charAt(i)=='O' || str.charAt(i)=='U')
				count++;
		}
		
		System.out.println("The count of vowels in string is "+count);
		
		char c[]=str.toCharArray();
		
		for(char i:c)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		char check_vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
		
		int count1=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<check_vowel.length;j++)
			{
				if(c[i]==check_vowel[j])
					count1++;
			}
		}
		
		System.out.println("The count of vowels in string is "+count1);	
	}
	
	public void toPrint_Numbers()
	{
		String str="HAI, WELCOME 123 check 56 &*.";
		
		System.out.println(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
				System.out.print(str.charAt(i)+" ");
		}
		
		System.out.println();
		char c[]=str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
				System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
	}
	
	public void toReverse()
	{
		String str="how are you";
		
		System.out.println(str);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		//char c[]=new char[str.length()];
		String rev =null;
		for(int i=0;i<str.length();i++)
		{
			//c[i]=str.charAt(str.length()-1-i);
			rev=rev+str.charAt(str.length()-1-i);
		}
		
		System.out.println(rev);	
	}
	
	public void toPrint_SpecialChar()
	{
		String str="hAi 1@!$& hello/4321+][?<>;'{}*";
		
		System.out.println(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)>='A' && str.charAt(i)<='Z') && !(str.charAt(i)>='a' && str.charAt(i)<='z') && !(str.charAt(i)>='0' && str.charAt(i)<='9'))
				System.out.print(str.charAt(i)+"");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Workspace obj=new String_Workspace();
		obj.toCount_character();
		obj.toCount_Vowels();
		obj.toPrint_Numbers();
		obj.toReverse();
		obj.toPrint_SpecialChar();
		obj.toChange_case();
		obj.toChangeCase_afterSpace();
	}

	public void toChangeCase_afterSpace() {
		// TODO Auto-generated method stub
		
		String str="welcome to india.";
		System.out.println();
		
		for(int i=0;i<str.length();i++)
		{
			if(i==0)
				System.out.print((char)(str.charAt(i)-32));
			
			else if(str.charAt(i)==' ')
				{
				System.out.print(str.charAt(i));
					System.out.print((char)(str.charAt(i+1)-32));
					i=i+1;
				}
			else
				System.out.print(str.charAt(i));	
		}
		System.out.println();
		
	}

	public void toChange_case() {
		// TODO Auto-generated method stub
//UPPER CASE
			String str="logan";
			System.out.println();
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' ')
				{
					System.out.print((char)(str.charAt(i)-32)+" ");
				}
			}
			System.out.println();
			
//lower case
			
			String str1="LOGAN";
			
			System.out.println(str1.toLowerCase());
			
			String s="Hai welcome to changing case";
			
			System.out.println(s);
			
			char ch[]=s.toCharArray();
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==' ')
				{
					ch[i-1]=(char)(ch[i-1]-32);
					ch[i+1]=(char)(ch[i+1]-32);
				}
			}
			
			System.out.println(ch);
	}
}
