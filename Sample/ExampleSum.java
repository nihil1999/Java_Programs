package Sample;

import java.util.Scanner;

public class ExampleSum {
	
	static int i=1;
	int num=100;
	
	static
	{
		i=i-- + --i;
		ExampleSum obj2=new ExampleSum();
		System.out.println(obj2);
	}
	
	{
		i=i++ - ++i;
	}
	
	public static void scanner()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		System.out.println(sc.nextInt());
	}
	
	public void prog(int num) {
		this.num=num*10;
	}
	
	public void display()
	{
		System.out.println(num);
	}
	
	 public static void main(String[] args) {
		 
		// ExampleSum obj=new ExampleSum();
		 i=i+i-i*i/i;
		 System.out.println(i);
		 
		// scanner();
		// obj.prog(2);
		// obj.display();
		 
		 ExampleSum obj1=new ExampleSum();
		 System.out.println(obj1);
		// obj1.display();
//		 System.out.println(obj2);
//		 obj2.prog(2);
//		 obj2.display();
		 
		 
	 }
	}
	 
