/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Name_inString {

	/**
	 * @param args
	 * 
	 */

	Scanner sc = new Scanner(System.in);

	public void getInfo() {
//		System.out.println("Enter name: ");
//		String str=sc.nextLine();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			System.out.print(str.charAt(i) + " ");
//		}	
//		System.out.println();
//		
		String s = "Wolverine";
		//System.out.println(s.length());
//		
//		for(int i=0;i<s.length();i++)
//		{
//			System.out.print(s.charAt(i)+" ");
//		}
//		
//		System.out.println();
//		
		String str1 = "NihIl";
//		
//		int count=0;
//		for(int i=0;i<str1.length();i++)
//		{
//			if(str1.charAt(i)=='i' || str1.charAt(i)=='i'-32)
//				count++;
//		}	
//		System.out.println(count);

		String s1 = "ab";
		String s2 = "aa";
//		System.out.println(s1.codePointAt(0));
//		System.out.println(s1.codePointBefore(2));

//		int count=0;
//		System.out.println("Enter the ending index to count the characters");
//		int num=sc.nextInt();
//		for(int i=0;i<s.length();i++)
//		{
//			if(count==num)
//			{
//				break;
//			}
//			count++;
//		}
//		
//		System.out.println(count);
//		System.out.println(s.codePointCount(0, num));
//		
//		System.out.println(s+" "+str1);
//		System.out.println(s.concat(str1));

//		System.out.println(s.contains("a"));
//		char c = 'ா';
//		System.out.println((int) c);
//		Info obj=new Info("abc");
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.equals(obj));
//		System.out.println(s1 +" "+obj);
//		System.out.println(Info.name);
//		char c1='a';
//		char c2='b';
//		char c3='a',c4='b';
//	//	System.out.println(((int)c1 + (int)c2 )- ((int)c3 + (int)c4));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.toUpperCase());
//		System.out.println((int)'\0');
		String st="hai hello \0welcome";
		System.out.println(st);
		char arr[]=st.toCharArray();
//		for(int i=0;i<arr.length;i++)
//		{
//			int a=arr[i]-32;
//			System.out.print((char)a);
//		//	System.out.println((char)(arr[i]-32));
//		}
		//System.out.println("hai"+(char)0+" "+" hi");
//		System.out.print('\012');   //'012' = \n new line.
//		System.out.println("hai");
//		//System.out.println(st);
//		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name_inString obj = new Name_inString();
		obj.getInfo();
	}
}
