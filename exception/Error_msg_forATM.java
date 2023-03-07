/**
 * 
 */
package exception;

/**
 * @author logan
 *
 */
public final class Error_msg_forATM {

	/**
	 * @param args
	 */
	
	public static final String err1_input_mismatch = "\"PIN number must be a positive whole number.\"";
	public static final String err2_range_notValid = "\"PIN number must be 4 digit.\"";
	public static final String err3_amt_mismatch = "\"Amount must be a positive whole number.\"";
	public static final String err4_amt_exceeds_bal = "\"Entered Amount is greater than the available balance, your balance is: "+ATM_program.bal+"\"";
	public static final String err5_amt_exceeds_transLimit = "\"Entered amount exceeds one time transaction limit : "+ATM_program.min_transaction+"\"";
	public static final String err6_choiceInvalid = "\"Invalid choice please enter the given choice\"";
	public static final String err7_choice_mismatch = "\"Choice should be a positive number\"";
	
	
	
	public Error_msg_forATM(int w) {
		// TODO Auto-generated constructor stub
		
	}
	
	public static String to_setWithdrwa(int w)
	{
		int withdraw=ATM_program.min_transaction_limitPerDay-w;
		return "\"Entered amount exceeds transaction limit for one day, per day transaction limit is : "+ATM_program.min_transaction_limitPerDay+". you can withdraw of maximum Rs "+withdraw+" only\"";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
