/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author logan
 *
 */
public class Info_ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li=new ArrayList();
		li.add("logan");
		li.add(07);
		float f=5.5f;
		li.add(f);
		System.out.println(li);
		List lis=new ArrayList();
		System.out.println(lis);
		lis.add("hello");
		System.out.println(lis);
		lis.add(li);
		lis.addAll(li);
		System.out.println(lis.size());
		System.out.println(lis);
		lis.addAll(1, li);
		System.out.println(lis);
		//lis.clear();
		System.out.println(lis);
		System.out.println(lis);
		System.out.println(lis.contains(li));
		//li.clear();
		System.out.println(lis);
		System.out.println(lis.contains(li));
		System.out.println(li.containsAll(li));
		System.out.println(li.equals(lis));
		lis.clear();
		lis.addAll(li);
		System.out.println(lis);
		System.out.println(li.equals(lis));
		System.out.println(lis);
		lis.remove(0);
		System.out.println(lis);
		lis.add("wolverine");
		lis.remove(li);
		System.out.println(lis);
		System.out.println(lis.get(0));
		//System.out.println(lis.removeAll(li));
		System.out.println(lis);
		lis.retainAll(li);
		System.out.println(lis);
		lis.set(0, "cap");
		System.out.println(lis);
		lis.add(0, "steve");
		System.out.println(lis);
		lis.get(50);
		}

}
