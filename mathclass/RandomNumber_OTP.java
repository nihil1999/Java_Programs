/**
 * 
 */
package mathclass;

import java.util.Random;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class RandomNumber_OTP {

	/**
	 * @param args
	 */
	
	public void toGet_RandomNumber()
	{
//		double a=Math.random()*10000;
//		System.out.println("Double: "+a);
//		System.out.println((int)a);
		
		Random r=new Random();
//		for(int i=1;i<5;i++) {
//			System.out.print(r.nextInt(9));
//			}
//		System.out.println();
//		System.out.println(r.ints());
		System.out.println(r.nextBoolean());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumber_OTP obj=new RandomNumber_OTP();
		for(int i=1;i<=10;i++) {
		obj.toGet_RandomNumber();
		}
		
		
		
	}

}
