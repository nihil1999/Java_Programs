/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * @author logan
 * @param 
 *
 */
public class Info{

	/**
	 * @param args
	 */
	
	public static void toCheck()
	{
		ArrayList<Integer> al=new ArrayList<Integer>(); 
		for(int i=1;i<=10;i++)
			al.add(i);
		
		int sum=0;
		ListIterator<Integer> lis=al.listIterator();
		while(lis.hasNext())
			sum+=lis.next();
		System.out.println(sum);
		
		ArrayList al2=new ArrayList(); 
		for(int i=1;i<=10;i++)
			al2.add(i);
		
		int sum1=0;
		ListIterator lir=al.listIterator();
		while(lir.hasNext())
			sum1+=(int)lir.next();
		System.out.println(sum1);
		
		ArrayList all=new ArrayList();
		all.add(12);
		all.add("hai");
		ArrayList<Integer> all2=new ArrayList<Integer>();
		all2.addAll(all);
		System.out.println(all2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toCheck();
		
		String str="abc";
		String str1="cde";
		System.out.println(str.compareTo(str1));
		ArrayList al2=new ArrayList();
		HashSet s=new HashSet();
		ArrayList al=new ArrayList();
		HashSet s1=new HashSet();
		al.add("logan");
		al.add("apple");
		al.add("mango");
		al.add("ball");
		al.add("wolverine");
		al.add("jack");
		al.add("mani");
		al.add("logan");
		for(int i=10;i>=1;i--)
			al2.add(1);
		s.addAll(al2);
		System.out.println(al2);
		//for(int i=1;i<=100;i++)
		System.out.println(s);
		s1.addAll(al);
		System.out.println(al);
		//for(int i=1;i<=100;i++)
		System.out.println(s1);
		TreeSet ts=new TreeSet(s1);
		System.out.println(ts);
		System.out.println(ts.ceiling("ball"));
		//System.out.println(ts.ceil);
	}

	

}
