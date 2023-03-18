package Sample;

import java.util.Calendar;

public class Hello {
	
	static Hello obj=new Hello("hai");
	
	public Hello(String s) {
		// TODO Auto-generated constructor stub
		System.out.println(s);
	}
	
	 public Hello() {
		// TODO Auto-generated constructor stub
	}

	int sum(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello welcome");
		int a=2;
		System.out.println(obj.sum(a,'a'));
		Hello obj1=new Hello();
		obj1.add();
		System.out.println("end");
	}
	
	void add()
	{
		System.out.println("hello");
	}

}

