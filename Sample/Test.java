package Sample;

class Test {

	int i;
	int b;
	static float c;
	
	static {
		c=3.5f;
		System.out.println("Static block");
	}

	Test() {
		System.out.println("Constructor in parent.");
		//this.add(); // we can call a method in constructor and static method also.
	}

	public Test(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("One argument constructor in parent.");
	}

	protected void add() {
		// Test obj=new Test();
		System.out.println("static method");
	}

	public void ownplace() {
		System.out.println("Grandfather built the house.");
	}

	public void his_ownplace() {
		// TODO Auto-generated method stub

	}

	public void savings_money() {
		// TODO Auto-generated method stub

	}

//	public static void main(String arg[]) {
//		Test obj=new Test();
//		//obj.add();
//	}

}
