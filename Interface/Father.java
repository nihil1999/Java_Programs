package Interface;

public class Father implements Grandfather {

	private double amt=5000;
	
	@Override
	public void ownplace() {
		// TODO Auto-generated method stub
		System.out.println("House built by father.");
	}

	public double get_Amount(double money) {
		System.out.println("Fathers money: " + amt);
		amt=amt-money;
		return money;
	}
	
	  public static void main(String arg[]) 
	  { 
			/*
			 * Father obj=new Father(); System.out.println("Fathers money: " + obj.amt);
			 */
	 }
}
