package Loop;

public class WhileLoop {
	
	public void displayEven(int limit)
	{
//using modulo
		//int start=1;
//		while(start<=limit)
//		{
//			if(start%2==0)
//				System.out.println("Even numbers: " + start);
//			start++;
//		}
		
//without modulo
//		int start=2;
//		while(start<=limit)
//		{
//				System.out.println("Even numbers: " + start);
//				start=start+2;
//		}

//using multiply
		int start=1;
		int count=0;
		while(start<=(limit/2))				
		{
				System.out.println("Even numbers: " + start*2);
				start++;
				count++;
		}
		System.out.println("\nCount of even numbers: " + count + "\n");
	}
	
	public void displayOdd(int limit)
	{
//using not equalto 
//		int start=1;
//		while(start<=limit)
//		{
//			if(start%2!=0)
//				System.out.println("Odd numbers: " + start);
//			start++;
//		}

//using multiply
		int start=1;
		while(start<=limit/2)
		{
				System.out.println("Odd numbers: " + (start*2-1));
				start++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=1;
		
		while(count<=5)
		{
			System.out.println("Welcome");
			count++;
		}
		System.out.println("\n");
		
		count=1;					// if we don't reassign the last iterated value will be taken as.
		while(count<=10)
		{
			System.out.println(count);
			count++;
		}
		System.out.println("\n");
		
		count=10;
		while(count>=1)
		{
			System.out.println(count);
			count--;
		}
		System.out.println("\n");
		
		WhileLoop obj=new WhileLoop();
		obj.displayEven(20);
		obj.displayOdd(20);
		
	}

}
