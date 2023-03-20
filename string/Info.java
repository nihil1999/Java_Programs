/**
 * 
 */
package string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Info {

	/**
	 * @param args
	 */

	Info object;
	int a;
	static String name;

	public Info() {

	}

	public Info(int a) {
		this.a = a;
	}

	public Info(String string) {
		// TODO Auto-generated constructor stub
		this.name = string;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		String s=new String("logan");
//		System.out.println(s);
//		
//		Info obj=new Info(12);
//		Info obj1=new Info("wolverine");
//		
//		System.out.println(obj +" "+obj1);
//		System.out.println(obj.getClass().getName());
//		System.out.println(obj.getClass());
//		
//		String n="hulk";
//		System.out.println(n.charAt(0));
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name: ");
//		System.out.println(sc.nextLine().charAt(0));

		String str = "abc";
		System.out.println(str);
		str = "xyz";
		System.out.println(str);

		System.out.println("123" + 5); // it will converted to string if we give other datatypes.it will join them. ( +
										// -> joining)

		String s = new String();
		System.out.println(s);
		// @Override
//	public String toString() {
//		return "a = "+ a + " "+name;
//	}

		int c = 10;
		int b = c;
		int d = b;
		System.out.println(c + " " + b + " " + d);
		c = 5;
		System.out.println(c + " " + b + " " + d);

		Info object = new Info();

		System.out.println(object);
		
		System.out.println("LOGAN".charAt(0));
		String str3="abc"+123;
		System.out.println(str3);
		char C='2'+0;			//2-> unicode +0 => unicode
		System.out.println(C);
		
		System.out.println(1+2+3+"4");
		System.out.println("1"+2+3+4+5);
		int sum=5;
		System.out.println("hai"+(sum+1));
		
		String str5="payilagam";
		System.out.println(str5.indexOf("a",0 ));
		int no=5;	
		
		String stri=new String("hai");
		String stri1="hai";
		System.out.println(stri.equals(stri1));
	}

	public String toString()
	{
		return Info.name;
	}

}
