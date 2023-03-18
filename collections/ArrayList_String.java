/**
 * 
 */
package collections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class ArrayList_String {

	/**
	 * @param args
	 */
	
	public static void toConvert(ArrayList<String> al)
	{
		String str[]=new String[al.size()];
//		ArrayList<String> stal=new ArrayList<String>();
//		ArrayList<Integer> nal=new ArrayList<Integer>();
//		ArrayList<Character> spal=new ArrayList<Character>();
		
//		ArrayList l1=new ArrayList();
//		ArrayList<Integer> l2=new ArrayList<Integer>();
//		ArrayList<Character> l3=new ArrayList<Character>();
		
		ArrayList<String> stal=new ArrayList<String>();
		ArrayList<String> nal=new ArrayList<String>();
		ArrayList<String> spal=new ArrayList<String>();
		
		
		
		
		for(int i=0;i<al.size();i++)
		{
			String s1="";
			String s2="";
			String s3="";
			str[i]=al.get(i);
			for(int j=0;j<str[i].length();j++)
			{
				if(str[i].charAt(j)>='A' && str[i].charAt(j)<='Z' || str[i].charAt(j)>='a' && str[i].charAt(j)<='z')
					s1+=str[i].charAt(j);
					//l1.add(str[i].charAt(j));	
				else if(str[i].charAt(j)>='0' && str[i].charAt(j)<='9')
					s2+=str[i].charAt(j);
					//l2.add(((int)str[i].charAt(j))-48);
				else
					s3+=str[i].charAt(j);
					//l3.add(str[i].charAt(j));
			}
//			stal.addAll(l1);
//			nal.addAll(l2);
//			spal.addAll(l3);
//			l1.clear();
//			l2.clear();
//			l3.clear();
			if(s1!="")
			stal.add(s1);
			if(s2!="")
			nal.add(s2);
			if(s3!="")
			spal.add(s3);
			
		}
		System.out.println("Character array list: "+stal);
		System.out.println("Number array list: "+nal);
		System.out.println("Special characters array list: "+spal);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string: ");
		for(int i=0;i<5;i++)
		{
			al.add(s.next());	
		}
		System.out.println(al);
		toConvert(al);
	}

}
