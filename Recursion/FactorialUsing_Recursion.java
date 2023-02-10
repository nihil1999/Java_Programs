package Recursion;

public class FactorialUsing_Recursion {
	
	public int factorial(int num)
	{
		int fact=1;
	
//increment method
//		for(int i=1;i<=num;i++)				
//		{
//			fact=fact*i;
//			System.out.print(fact + " ");
//		}
//		System.out.println("\nFactorial of " + num + " is: " + fact);

//Factorial using recursion
		if(num!=0)
		{
			num=num*factorial(num-1);
			return num;
		}
		else
			return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsing_Recursion obj=new FactorialUsing_Recursion();
		System.out.println(obj.factorial(5));
	}

}
