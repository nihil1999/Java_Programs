/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * @author logan
 *
 */
public class Collections_sort {

	/**
	 * @param args
	 */
	
//	public static void toSort(ArrayList<String> al)
//	{
//		Comparator cm=new Comparator()
//				{
//					@Override
//					public int compare(Object o1, Object o2) {
//						// TODO Auto-generated method stub
//						if(o1.compareTo(o2)>0)
//							return 1;
//						else if(o1.compareTo(o2)<0)
//							return -1;
//						else	
//							return 0;
//					}
//				};
//		Collections.sort(al,cm);
//		System.out.println(al);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("hai");
		//toSort(al);
		al.add("hello");
		al.add("arun");
		al.add(98);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
