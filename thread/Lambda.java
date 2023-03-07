/**
 * 
 */
package thread;

/**
 * @author logan
 *
 */

public class Lambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m=() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hello");
			}
		};
		
		System.out.println("hai");
		m.add();
		
	}

}
