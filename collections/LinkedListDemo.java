package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String > names = new HashSet<>();
		
		names.add("rajesh");
		names.add("chandru");
		names.add("nehil");
		names.add("praveen");
		names.add("benito");
		names.add(null);
		
		
		
		Iterator<String> i = names.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		names.add("arun");
		names.add("madhavan");
		System.out.println(names);
		
		names.add( "parthiban");
		System.out.println(names);
		LinkedHashSet lh=new LinkedHashSet(); 	
	}

}
