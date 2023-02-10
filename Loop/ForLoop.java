package Loop;

public class ForLoop {
	
//print even number using modulo 
	public void display_even()
	{
		int i;
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
				System.out.println("Even numbers: " + i);
				
		}
	}

//print odd number without using modulo 
	public void display_odd()
	{
		int i;
		for(i=1;i<=20;i=i+2)
		{
				System.out.println("Odd numbers: " + i);

		}
	}
	
	public void sumOf_even()
	{
		int i;
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				int count=i+(i-2);
				System.out.println("Sum of Even numbers: " + count);
			}
		}
	}
	
	public void to_notPrint()
	{
		int i;
		for(i=1;i<=20;i++)
		{
			
//print the numbers expect some numbers using not equal to.
//			if(i!=5)    
//			{
//				System.out.println(i);
//			}

//print the numbers expect some numbers using continue.
			if(i==5)
				continue;
			else
				System.out.println(i);
			
//			if(i%9==0)
//			{
//				continue;
//				//System.out.println(i);
//			}
//			else
//				System.out.println(i);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop obj=new ForLoop();
		obj.display_even();
		obj.sumOf_even();
		obj.to_notPrint();
		obj.display_odd();
		
		System.out.println("\nworkspace");
		int i=1;
		for(;i<=5;)
		{
			System.out.println(i);
			i++;
		}
		System.out.println();
		 i=1;
		for(;i<=5;)
		{
			System.out.println(i);
			i++;
		}
		
	}

}
