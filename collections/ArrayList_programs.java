/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class ArrayList_programs {

	/**
	 * @param args
	 */
	
	public static void even_oddArrayList(ArrayList<Integer> al)
	{
		ArrayList<Integer> eal=new ArrayList<Integer>();
		ArrayList<Integer> oal=new ArrayList<Integer>();
		
		for(int i=0;i<al.size();i++)
		{
			if((int)al.get(i)%2==0)
				eal.add(al.get(i));
			else
				oal.add(al.get(i));
		}
		
		System.out.println("Even array list: "+eal);
		System.out.println("Even array list: "+oal);
	}
	
	public static void reverseList(ArrayList<Integer> al)
	{
		ArrayList<Integer> ral=new ArrayList<Integer>();
//		for(int i=al.size()-1;i>=0;i--)
//		{
//			ral.add(al.get(i));
//		}
		
		ListIterator<Integer> lir=al.listIterator();
		
		while(lir.hasNext())
		{
			lir.next();
		}
		while(lir.hasPrevious())
		{
			ral.add(lir.previous());
		}

		System.out.println("Reverse array list: "+ral);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter numbers");
//		for(int i=0;i<10;i++)
//		{
//			al.add(sc.nextInt());
//		}
		
		//Scanner s=new Scanner(System.in);
		ArrayList<String> sal=new ArrayList<String>();
		System.out.println("Enter string");
		for(int i=0;i<5;i++)
		{
			
			sal.add(sc.next());
		}
		
		System.out.println(al);
		System.out.println(sal);
		
		//even_oddArrayList(al);
		//reverseList(al);
		stringSeparateArray(sal);
		sc.close();
		
	}

	private static void stringSeparateArray(ArrayList<String> sal) 
	{
		
		ArrayList<Character> cal=new ArrayList<Character>();
		ArrayList<Integer> nal=new ArrayList<Integer>();
		ArrayList<Character> spal=new ArrayList<Character>();
		ListIterator<String> ltr=sal.listIterator();
		String str="";
		
		while(ltr.hasNext())
		str+=ltr.next();
		
		//String str="";
		System.out.println(str+" "+str.length());
		for(int i=0;i<str.length();i++)
		{
			//str+=(String)(sal.get(i));
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z')
				cal.add(str.charAt(i));	
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
				nal.add(((int)str.charAt(i))-48);
			else
				spal.add(str.charAt(i));		
		}
		
		System.out.println("Character array list: "+cal);
		System.out.println("Number array list: "+nal);
		System.out.println("Special characters array list: "+spal);
	}

}
