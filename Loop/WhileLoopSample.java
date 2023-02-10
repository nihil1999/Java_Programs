package Loop;

public class WhileLoopSample {
	
	public void sumOf_numbers(int n)
	{
		int num=1;
		int sum=0;
		while(num<=n)
		{
			System.out.print(num + " ");
			sum+=num;
			num++;
		}
		System.out.println("\nSum of numbers: " + sum );
	}
	
	public void sumOf_Reversenumbers(int n)
	{
		//int num=1;
		int sum=0;
		while(n>=1)
		{
			System.out.print(n + " ");
			sum+=n;
			n--;
		}
		System.out.println("\nSum of numbers: " + sum );
	}
	
	public void reverseEven(int n)
	{
		while(n>0)
		{
			if(n%2==0)
				System.out.println("Even numbers in reverse order: " + n);
			n--;
		}
	}
	
	public void multiplesOf(int num1,int num2,int limit)
	{
//multiples of both numbers: common for both numbers
//		System.out.print("\nMultiples of " + num1 + " and " + num2 + ": ");
//		int start=1;
//		while(start<=limit)
//		{
//			if(start%3==0  && start%5==0)
//				System.out.print(start + " ");
//			start++;
//		}
		
//multiples of both numbers
		System.out.print("\nMultiples of " + num1 + " or " + num2 + ": ");
		int start=1;
		while(start<=limit)
		{
			if(start%3==0  || start%5==0)
				System.out.print(start + " ");
			start++;
		}
	}
//sum of first 10 even numbers	
	public void sumOfEvenNumbers(int limit,int range)
	{
		int start=1;
		int sum=0,count=0;
		System.out.print("\nEven numbers: ");
		while(start<=limit)
		{
			if(start%2==0)
			{
				System.out.print(start + " ");
				count++;
				if(count<=range)
				{
					sum+=start;
				}
				
			}
			start++;
			
		}
		System.out.println("\nSum of first " + range + " even numbers: " + sum);
	}
	
//sum of next 10 even numbers	
	public void sumOfSecondEvenNumbers(int limit,int range)
	{
		int start=1;
		int sum=0,count=0;
		System.out.print("\nEven numbers: ");
		while(start<=limit)
		{
			if(start%2==0)
			{
				System.out.print(start + " ");
				count++;
				if(count>10 && count<=range)
				{
					sum+=start;
				}
				
			}
			start++;
			
		}
		System.out.println("\nSum of second " + range + " even numbers: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoopSample obj=new WhileLoopSample();
		obj.sumOf_numbers(10);
		obj.sumOf_Reversenumbers(10);
		obj.reverseEven(20);
		obj.multiplesOf(3, 5, 20);
		obj.sumOfEvenNumbers(100, 10);
		obj.sumOfSecondEvenNumbers(100, 20);
	}

}
