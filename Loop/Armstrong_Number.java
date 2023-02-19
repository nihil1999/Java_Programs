/**
 * 
 */
package Loop;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Armstrong_Number {

	/**
	 * @param args
	 */
	
	public void toCheck_ArmstrongNumber(int num)
	{
		int num1=num;
		int num2=num;
		int count=0;
		
		while(num1>0)
		{
			num1/=10;
			count++;
		}
		
		int sum=0,rem=0;
		
		while(num2>0)
		{
			int c=1, mult=1;
			rem=num2%10;
			
			while(c<=count)
			{
				mult*=rem;
				c++;
			}
			
			sum+=mult;
			num2/=10;
		}
		
		if(sum==num)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an armstrong number");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong_Number obj=new Armstrong_Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int num=sc.nextInt();
		obj.toCheck_ArmstrongNumber(num);
		
	}

}
