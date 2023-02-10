package Recursion;

public class FibonacciUsing_Recursion {
	
	public int fibonacci(int num,int firstnum,int secondnum,int sum,int count)
	{
		if(count<=num)
		{
			sum+=firstnum;
			secondnum=firstnum+secondnum;
			firstnum=secondnum-firstnum;
		    return fibonacci(num,firstnum,secondnum,sum,count+1);
		}
		else
			return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciUsing_Recursion obj=new FibonacciUsing_Recursion();
		System.out.println("num "+ obj.fibonacci(5,0,1,0,1));
	}

}
