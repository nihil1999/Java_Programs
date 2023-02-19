/**
 * 
 */
package arraySorting;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author logan
 *
 */
public class SortingArray_usingPreDefinedMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr2[]= {1,5,4,3,2};
		Arrays.sort(arr2);
//		for(int i:arr2)
//		{
//			System.out.print(i+" ");
//		}
		Arrays.sort(arr2, Collections.reverseOrder());
		for(int i:arr2)
		{
			System.out.print(i+" ");
		}
	}

}
