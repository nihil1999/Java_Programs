package Interface;

public class Son extends Father {

	public int savings;

	public Son(int savings) {
		// TODO Auto-generated constructor stub
		this.savings = savings;
		System.out.println("Constructor");
	}

	public void ownplace() {
		// TODO Auto-generated method stub
		System.out.println("House built by Son.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father obj1 = new Son(5000);
		System.out.println(obj1.get_Amount(1000));
		obj1.ownplace();
		main(10);
	}

	public static void main(int a)
	{
		System.out.println("Main method");
	}
}
