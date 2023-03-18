/**
 * 
 */
package thread;

/**
 * @author logan
 *
 */
public class Customer {

	/**
	 * @param args
	 */
	static int bal=500;
	
//	public Customer(int i) {
//		// TODO Auto-generated constructor stub
//		bal=i;
//	}

	public synchronized void withdraw(int w)
	{
		bal=bal-w;
		System.out.print(" thread one : "+bal);
	}
	
	public synchronized void withdraw_in_ATM(int w)
	{
		bal=bal-w;
		System.out.print(" thread two : "+bal);
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Customer obj=new Customer();
		
		Runnable a= ()->
		{
			System.out.println("One: ");
			obj.withdraw(500);
			obj.withdraw_in_ATM(500);
		};
		
//		Runnable b= ()->
//		{
//			System.out.println("\nTwo: ");
//			obj.withdraw_in_ATM(500);
//			
//		};
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("\n"+obj.bal);
	}

}
