/**
 * 
 */
package Loop;

import java.util.Scanner;

/**
 * @author logan
 *to find the least number of bottles to completely fill the items without mixing.  
 *10 15 20 => output: 9 bottles -> 5 litre bottle: 10 ->2 , 15 ->3 , 20 ->4 = 2+3+4= 9 bottles, size: 5 litre
 */
public class Find_howMany_Bottles {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	
	public void toFind_bottles()
	{
		 System.out.println("To find the least number of bottles to fill the items. ");
		 System.out.println("Enter number1: ");
		 int num1=sc.nextInt();
		 System.out.println("Enter number2: ");
		 int num2=sc.nextInt();
		 System.out.println("Enter number3: ");
		 int num3=sc.nextInt();
//Method 1		 															// 10, 15 ,20
		 int index=0;
		 
		 int range= Math.min(num1,Math.min(num2, num3));   //to find the lowest number to assign the limit for for loop. like: 11 lit bottle will have extra 1 lit for 10 litre.
		 
		// System.out.println(range);
		 int count=0;
		 boolean flag=false;								//if user gives -ve or 0 then it'll show invalid.
		 
		 for(int i=1;i<=range;i++)
		 { 
			 if(num1%i==0 && num2%i==0 && num3%i==0)
			 {
				 count++;									//to count how many numbers can divide all the given numbers so that total bottles can be stored in array to find least bottles.
				 flag=true;
			 } 
		 }
		 
//		 if(flag==false)
//			 System.out.println("Invalid");
//		 else 
//		 {
//		 arr=new int[count];
//		 
//		 for(int i=1;i<=range;i++)
//		 {
//			 int sum=0;
//			 
//			 if(num1%i==0 && num2%i==0 && num3%i==0)			//if a number divides all the given number then enters into this block.
//			 {
//				 sum=(num1/i)+(num2/i)+(num3/i);				//then we sum the quotient of dividing given numbers by that number, so that total no of bottles can be found.
//				 arr[index]=sum;								//then store the total in array.
//				 index++;
//			 } 
//		 }
//		 
//		 int bottle=Integer.MAX_VALUE;				//at first bottle will have int max range to be in safer side.
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 if(bottle>arr[i])							//the least no of bottles will be taken out.
//				 bottle=arr[i];
//		 }
//		 System.out.print("Least bottle to fill the items is "+bottle+" bottles."); 
//	   }
		 
//Method 2.
		 System.out.println();
		 int number=1;
		 if(flag==false)
			 System.out.println("Invalid");
		 else 
		 {
		 for(int i=1;i<=range;i++)
		 { 
			 if(num1%i==0 && num2%i==0 && num3%i==0)
			 {
				number=i;									//we need greatest common factor it'll give last divisor 
			 } 
		 }
		 int bottle=(num1+num2+num3)/number;				//then we sum the given numbers and divide it by divisor (gcd -greatest common divisor).
		 System.out.println("Least bottle to fill the items is "+bottle+" bottles.");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_howMany_Bottles obj=new Find_howMany_Bottles();
		obj.toFind_bottles();
	}

}
