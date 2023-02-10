package Conditional;

public class IF_Sample {

	float interestRate1;
	float interestRate2;
	float interestRate3;

	public IF_Sample(float interestRate1, float interestRate2, float interestRate3) {
		// TODO Auto-generated constructor stub
		this.interestRate1 = interestRate1;
		this.interestRate2 = interestRate2;
		this.interestRate3 = interestRate3;
	}

	public float get_interest_rate(int age)

	
	 //else if ladder 
		{
			if (age > 0 && age < 18) {
				System.out.println("Your age is under 18, you're not eligible.");
				return 0;
			} else if (age >= 18 && age < 60) {
				// System.out.println("Your interest rate is 6%.");
				return interestRate1;
			}

			else if (age >= 60 && age <= 80) {
				// System.out.println("Your interest rate is 6.5%.");
				return interestRate2;
			} else if (age > 80 && age < 150) {
				// System.out.println("Your interest rate is 9%.");
				return interestRate3;
			} else {
				System.out.println("Invalid age please mention it correctly.");
				return 0;
			}
		} 

	// nested if

//	{
//		if (age > 18 && age < 150) {
//
//			if (age >= 18 && age < 60) 
//			{
//				//System.out.println("Your interest rate is 6%.");
//				return interestRate1;
//			}
//
//			else if (age >= 60 && age <= 80) 
//			{
//				//System.out.println("Your interest rate is 6.5%.");
//				return interestRate2;
//			} 
//			else 
//			{
//				//System.out.println("Your interest rate is 9%.");
//				return interestRate3;
//			}
//		}
//
//		else 
//		{
//			System.out.println("Invalid age please mention it correctly.");
//			return 0;
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IF_Sample obj = new IF_Sample(6f, 6.5f, 9f);
		float rateOfInterest = obj.get_interest_rate(5);
		if (rateOfInterest != 0)
			System.out.println("Your interest rate is: " + rateOfInterest + "%");
		
		int flag=10;
		if(flag>0)
			System.out.println("Hello");
		if(flag<50)				//if we didn't give else if it will check the next condition too.
			System.out.println("Hi");
	}

}
