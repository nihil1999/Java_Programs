/**
 * 
 */
package string;

/**
 * @author logan
 *
 */
public class Info {

	/**
	 * @param args
	 */
	int a;
	Info(int a)
	{
		this.a=a;
	}
	public Info(String string) {
		// TODO Auto-generated constructor stub
		String name=string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("logan");
		System.out.println(s);
		Info obj=new Info(12);
		Info obj1=new Info("wolverine");
		System.out.println(obj +" "+obj1);
		System.out.println(obj.getClass().getName());
		System.out.println(obj.getClass());
		
		String n="hulk";
		System.out.println(n.charAt(0));
		
	}
	//@Override
//	public String toString() {
//		return "a = "+ a + " "+name;
//	}
	

}
