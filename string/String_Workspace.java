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

//to count the given character in a string.
	public void toCount_character()
	{
		System.out.println("\n--------------This is to count the given character:--------------------------\n");
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

//to count the vowels in a string.
	public void toCount_Vowels()
	{
		System.out.println("\n--------------This is to count the vowels:--------------\n");
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

//to print only the numbers in a string
	public void toPrint_Numbers()
	{
		System.out.println("\n--------------This is to print only the numbers in a string:--------------\n");
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

//to reverse the string
	public void toReverse()
	{
		System.out.println("\n--------------This is to print string in reverse:--------------\n");
		String str="how are you";
		
		System.out.println(str);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		//char c[]=new char[str.length()];
		String rev ="";
		for(int i=0;i<str.length();i++)
		{
			//c[i]=str.charAt(str.length()-1-i);
			rev=rev+str.charAt(str.length()-1-i);
		}
		
		System.out.println(rev);	
	}
	
//to print only the special characters in a string.
	public void toPrint_SpecialChar()
	{
		System.out.println("\n--------------This is to print only the special characters:--------------\n");
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
		System.out.println("\n--------------This is to change the case after space:--------------\n");
		String str="Welcome to India.";
		System.out.println(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(i==0 && str.charAt(i)>='a' && str.charAt(i)<='z')
				System.out.print((char)(str.charAt(i)-32));
			
			else if(str.charAt(i)==' ' && str.charAt(i+1)>='a' && str.charAt(i+1)<='z')
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
		System.out.println("\n--------------This is to print the string in upper case:--------------\n");
			String str="lOgan";
			System.out.println(str);
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' ' && str.charAt(i)>='a' && str.charAt(i)<='z' )
				{
					System.out.print((char)(str.charAt(i)-32));
				}
				else
					System.out.print(str.charAt(i));
			}
			System.out.println();
			
//lower case
			System.out.println("\n--------------This is to print the string in lower case:--------------\n");
			String str1="LOGaN";
			System.out.println(str1);
			
			System.out.println(str1.toLowerCase());

//to change case before and after space.
			System.out.println("\n--------------This is to change case before and after space:--------------\n");
			String s="HaI welcome To changing case";
			
			System.out.println(s);
			
			char ch[]=s.toCharArray();
			
			for(int i=0;i<ch.length;i++)
			{
					if(ch[i]==' ' && ch[i-1]>='a' && ch[i-1]<='z' )
						ch[i-1]=(char)(ch[i-1]-32);
					if(ch[i]==' ' && ch[i+1]>='a' && ch[i+1]<='z' )
						ch[i+1]=(char)(ch[i+1]-32);
			}
			
			System.out.println(ch);
	}
}
