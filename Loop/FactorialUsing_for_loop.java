package Loop;

public class FactorialUsing_for_loop {
	
	public void factorial(int num)
	{
		int fact=1;
		
//increment method
		
		for(int i=1;i<=num;i++)				
		{
			fact=fact*i;
			System.out.print(fact + " ");
		}
		System.out.println("\nFactorial of " + num + " is: " + fact);

//decrement method
		
//		for(int i=num;i>1;i--)				
//		{
//			fact=fact*i;
//			System.out.print(fact + " ");
//		}
//		System.out.println("\nFactorial of " + num + " is: " + fact);

//decrement and 5*4*3*2*1
		
//		fact=num;							  
//		for(int i=num;i>1;i--)
//		{
//			//System.out.print(i + " ");
//			fact=fact*(i-1);
//			System.out.print(fact + " ");
//		}
//		System.out.println("\nFactorial of " + num + " is: " + fact);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsing_for_loop obj=new FactorialUsing_for_loop();
		obj.factorial(5);

	}

}
