/**
 * 
 */
package string;

/**
 * @author logan
 *
 */
public class String_Methods_Info {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="Lion King movie is good in 2021.";
		System.out.println(string);		
//in first occurrence		
		System.out.println(string.indexOf('i'));	//(the character will be converted to unicode: parameter-> (int ch))returns the index of given character where it occurred first in a string if presents, else returns -1.
		 
		System.out.println(string.indexOf('L',0));		//returns the index of given character here we can given the start index i.e. from which index it should be start checking.
		
		System.out.println(string.indexOf("21",8 ));	//returns the index of given string's first character here we can given the start index i.e. from which index it should be start checking.
		
		System.out.println(string.indexOf("in"));	//returns the index of given string's first letter if the given string is presents, else it returns -1.

//in last occurrence
		System.out.println(string.lastIndexOf('i'));  //returns the index of given character where it occurred last in a string if presents, else returns -1
		
		System.out.println(string.lastIndexOf("od"));
		
		System.out.println(string.lastIndexOf('n', 28));		//it checks from the index that given from backwards  like if we give 3 => 3,2,1,0 so it gives the index where the character first occurred from backwards.

		System.out.println(string.lastIndexOf("02", 30));
		
//		String array[]=string.split("o");		//it removes the given string and splits the string into string array by the given string.
//		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		
//		for(String i:array)
//		System.out.print(i+" ");
		
	}

}
