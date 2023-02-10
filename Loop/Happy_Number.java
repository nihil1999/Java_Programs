package Loop;

import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		int flag=0;
		int r,q;
		int sum=0;
		while(num!=0)
		{
			if(num==1)
				{
				flag=1;
				break;
				}
			else
			{
				if(num<10 && num!=1)
				{
					num=num*num;
				}
				if(num>99)
				{
					int count=0;
					int n=num;
					while(n!=0)
					{
						r=n%10;
						sum=sum+(r*r);
						n/=10;
						count++;
					}
					while(count!=0)
					{
						r=num%10;
						sum=sum+(r*r);
						num/=10;
						count--;
					}
					num=sum;
				}
				if(num>9 && num<100) {
					r=num%10;
					q=num/10;
					num=(q*q)+(r*r);
				}
			}
		}
		
		if(flag==1)
			System.out.println("Happy Number");
		else
			System.out.println("not a Happy Number");
	}

}
