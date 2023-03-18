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
public class Sample_programs {

	/**
	 * @param args
	 */
	
	//public 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		for(int i=1;i<=5;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		System.out.println(toStoreEven(al));
		System.out.println(toStoreOdd(al));
		System.out.println("Sum of elements: "+toGetSumOfElements(al));
		System.out.println("Sum of even index elements: "+toGetSumOf_EvenIndexElements(al));
		System.out.println("Sum of odd index elements: "+toGetSumOf_OddIndexElements(al));
		
		for(int i=10;i<20;i=i+2)
		al.add(i);
		for(int i=11;i<19;i=i+2)
		al.add(i);
		System.out.println(toRemoveEvenElements(al,toStoreEven(al)));
	}

	private static List toRemoveEvenElements(ArrayList al,List eal) {
		// TODO Auto-generated method stub
		System.out.println("List: " +al);
		al.removeAll(eal);
		return al;
	}

	private static int toGetSumOf_OddIndexElements(ArrayList al) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			if(i%2!=0)
			sum=sum+(int)al.get(i);
		}
		return sum;
	}

	private static int toGetSumOf_EvenIndexElements(ArrayList al) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			if(i%2==0)
			sum=sum+(int)al.get(i);
		}
		return sum;
	}

	private static int toGetSumOfElements(ArrayList al) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum=sum+(int)al.get(i);
		}
		return sum;
	}

	private static List toStoreOdd(ArrayList al) {
		// TODO Auto-generated method stub
		ArrayList arl=new ArrayList();
		for(int i=0;i<al.size();i++)
		{
			if((int)al.get(i)%2!=0)
			{
				//System.out.println(al.get(i));
				arl.add(al.get(i));
			}
		}
		return arl;
	}

	private static List toStoreEven(List al) {
		// TODO Auto-generated method stub
		ArrayList arl=new ArrayList();
		for(int i=0;i<al.size();i++)
		{
			if((int)al.get(i)%2==0)
			{
				//System.out.println(al.get(i));
				arl.add(al.get(i));
			}
		}
		
		return arl;
	}

}
