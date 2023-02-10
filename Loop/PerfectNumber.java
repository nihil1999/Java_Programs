package Loop;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		if(sum==num)
			System.out.println(num + " is a Perfect Number");
		else
			System.out.println(num + " is not a Perfect Number");
	}

}
