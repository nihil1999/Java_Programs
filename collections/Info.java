/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author logan
 * @param 
 *
 */
public class Info<E> extends ArrayList<E>{

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
		Info obj=new Info();
		obj.add("logan");
		System.out.println(obj);
		toCheck();
		
		String str="abc";
		String str1="cde";
		System.out.println(str.compareTo(str1));
		ArrayList al2=new ArrayList();
		Set s=new HashSet();
		al2.add(1);
		al2.add(2);
		al2.add(1);
		al2.add(3);
		s.addAll(al2);
		System.out.println(al2);
		System.out.println(s);
		
		
	}

//	@Override
//	public String toString() {
//		return "empty";
//	}
	

}
