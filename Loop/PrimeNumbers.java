package Loop;

public class PrimeNumbers {
	
	public void check_primeNumber(int num)
	{
		if(num>=2) 
		{
			if(num==2 || num==3 || num==5 || num==7)
			{
				System.out.println("It is a prime number.");
			}
			else if(num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0)
					System.out.println("It is a prime number.");
			else
				System.out.println("Not a prime number.");
		}
		else
			System.out.println("Not a prime number.");
	}
	
	public void display_primeNumber(int limit)
	{
		int num=1;
		while(num<=limit)
		{
			if(num>=2) 
			{
				if(num==2 || num==3 || num==5 || num==7)
				{
					System.out.print(num + " ");
				}
				else if(num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0)
					System.out.print(num + " ");
			}
			num++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers obj=new PrimeNumbers();
		obj.check_primeNumber(151);
		obj.display_primeNumber(100);
	}

}
