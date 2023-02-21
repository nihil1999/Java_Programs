/**
 * 
 */
package string;

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
	}

	public String toString()
	{
		return Info.name;
	}

}
