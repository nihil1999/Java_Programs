package Sample;

//abstract class can extend a class
public abstract class Test1 extends Test{

		static {
			System.out.println("Static method in abstract");
		}
		
	Test1() {
		System.out.println("Constructor in abstract.");
	}

	public abstract void his_ownplace();

	public void savings_money() {
		System.out.println("Money in the bank deposited by father.");
	}

	public void ownplace() {
		System.out.println("Father is staying in Grandfather's house.");
	}

}
