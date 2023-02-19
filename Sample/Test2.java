package Sample;

public class Test2 extends Test {

	static int a=50;
	public int b;
	
	static {
		//c=2.5f;
		System.out.println("Static block in childclass");
	}

	Test2() {
		// super(12); //default super() will be given by compiler
		// this(12); //we can't use this()and super() both in a constructor.
		System.out.println("Constructor in child.");

	}

	public Test2(int i, int b) {
		// TODO Auto-generated constructor stub
		// this();
		super.i = i;
		this.b = b;
		System.out.println("one argument Constructor in child");
		System.out.println(this.b);
	}

	@Override
	public void his_ownplace() {
		// TODO Auto-generated method stub
		System.out.println("Son built the house in father's land.");
	}

	public void ownplace() {
		System.out.println("Son stays in Grandfather's house.");
	}
	
	public void get_objectid(Test2 arg)		//arg is an reference of an object that we created. 
	{
		System.out.println("Object id: " + arg);		//object reference id.
	}
	
	public void add()
	{
		System.out.println("child");
		
	}
	
	public static void main(String arg[]) {
		Test obj = new Test2(10, 20);
		// Test obj=new Test2();
		// System.out.println(a);
		// Test obj=new Test();
		//c=1.5f;
//		System.out.println("Object ID in main method: " + arg);		//object reference id for arg. arg is an object of java.lang.String
//		System.out.println(obj.i);
//		System.out.println(obj.b);
//		System.out.println(a);
//		System.out.println("Object ID: " + obj);		//object reference id.
		
//		obj.ownplace();
//	//	obj.get_objectid(obj);  		//here i m passing an object as an argument.
		obj.add();
//		obj.his_ownplace();
//		obj.savings_money();
		//add();

//		Test obj1 = new Test2(1, 2);
//		System.out.println(obj1.i);
//		System.out.println(obj1.b);
//		System.out.println(a);
//		System.out.println(c);

	}
}
