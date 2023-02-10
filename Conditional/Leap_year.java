package Conditional;

import java.util.Scanner;
//year divisible by 4 and century year divisible by 400.
public class Leap_year {

		public void check_leapYear(int year)
		{
		if(year%100!=0 ) {
			if(year%4==0)
				System.out.println(year + " is a Leap Year.");
			else
				System.out.println(year + " is not a Leap Year.");
		}
		else
			{
			if(year%400==0)
				System.out.println(year + " is a Leap Year.");
			else
				System.out.println(year + " is not a Leap Year.");
			}
		}
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leap_year obj=new Leap_year();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year=s.nextInt();
		obj.check_leapYear(year);
	}
}
