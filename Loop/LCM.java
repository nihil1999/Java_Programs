/**
 * 
 */
package Loop;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class LCM {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public void toGet_nextBell()
	{
		 System.out.println("To find time of next bell sound . ");
		 System.out.println("Enter number1: ");
		 int num1=sc.nextInt();
		 System.out.println("Enter number2: ");
		 int num2=sc.nextInt();
		 System.out.println("Enter number3: ");
		 int num3=sc.nextInt();
		 System.out.println("Enter start time: ");
		 int time=sc.nextInt();
		 System.out.println("Enter how many time: ");
		 int count=sc.nextInt();
		 boolean flag=false;
		 
		 
		 int range= Math.min(num1,Math.min(num2, num3)); 
		 int number=1;
		 int result=(num1*num2*num3);
		 for(int i=1;i<=range;i++)
		 { 
			 if(num1%i==0 && num2%i==0 && num3%i==0)
			 {
				number=i;
				result=(num1*num2*num3)/(number*number);
			 } 
			 else if(num1%i==0 && num2%i==0 || num1%i==0 && num3%i==0 || num2%i==0 && num3%i==0)
			 {
				 number=i;
				 result=(num1*num2*num3)/(number);
			 }
		 }
		 
		 int min=00,day=0;
//		 int result=(num1*num2*num3)/(number*number);
		 System.out.println(result);
		 if(result<60)
			 System.out.println("Next time is "+time+"."+result+"");
		 else {
		 while(count>0) {
			 if(result%60!=0)
				 min=result%60;
		 time=time+(result/60);
		 while(time>24) 
		 	{
			 	time-=24;
			 	day++;
			 }
//		 while(time>12) 
//		 	{
//			 	time-=12;
//			 }
		 System.out.println("Next time is in "+day+" days and "+time+" hrs");
		 count--;
		 }
		 }
		 
		 
//Method 2
		 int max=num3;
		 int lcm=0;
		 while(lcm<=num3) 
		 {
		  if(max%num1==0 && max%num2==0 && max%num3==0) 
		  {
		   lcm=max;
		   break;
		  }
		  max++;
		 }
		 System.out.println(lcm);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCM obj=new LCM();
	//	obj.toGet_nextBell();	
	}

}
