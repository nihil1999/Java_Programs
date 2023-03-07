/**
 * 
 */
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class ATM_program {

	/**
	 * @param args
	 */
	Scanner sc;
	
	public static int bal=150000;
	
	public static int withdraw;
	
	public static final int min_transaction=20000;
		
	public static final int min_transaction_limitPerDay=50000;
	
	public void to_verify_pin()
	{
		System.out.println(withdraw);
		sc=new Scanner(System.in);
		System.out.println("\nWelcome to the ATM\n");
		int pin=0;
		int pin_range=4;
		int count=0;
		
		try 
		{
			System.out.println("Enter your 4 digit ATM pin to start: ");
			pin=sc.nextInt();
			
			count=toCheckDigit(pin);
			
			if(count!=pin_range)
				{
					throw new ATM_PinException(Error_msg_forATM.err2_range_notValid);
				}
			else
				{
					System.out.println("\nPIN Valid\n");
					toWithdrawal();
				}
		}
		
		catch(InputMismatchException e)
		{
			e=new InputMismatchException(Error_msg_forATM.err1_input_mismatch);
			System.out.println("\n"+e.getMessage());
			//to_verify_pin();
		} 
		
		catch (ATM_PinException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("\n"+e.getMessage());
			//to_verify_pin();
		}
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("\n"+e.getMessage());
		}
		
		toRepeat();
	}
	
	public void toWithdrawal() {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		try 
		{
			System.out.println("\nEnter the amount to be withdraw:");
			int amt=sc.nextInt();
			System.out.println(withdraw);
			
			
			if(amt>bal)
			{
				throw new AmountException(Error_msg_forATM.err4_amt_exceeds_bal);			//minimum balance exception
			}
			else if(amt>min_transaction)
			{
				throw new AmountException(Error_msg_forATM.err5_amt_exceeds_transLimit);		//amount exceeds one time transaction limit
			}
			else if(amt<0)
			{
				throw new AmountException(Error_msg_forATM.err3_amt_mismatch);				// if amount in -ve
			}
			else if(amt==0)
			{
				throw new AmountException(Error_msg_forATM.err3_amt_mismatch);				// if amount is 0
			}
			else if(withdraw+amt>min_transaction_limitPerDay)
			{
				
				throw new AmountException(Error_msg_forATM.to_setWithdrwa(withdraw)); //if amount exceeds per day transaction limit.
			}
			else {
					withdraw+=amt;
					System.out.println("\nPlease collect your cash....\n"+"\nAmount -  Rs "+amt+"  debited successfully.");
					bal-=amt;
					System.out.println("\nCurrent Balance is: "+bal);
			}
		}
		
		catch(InputMismatchException e)
		{
			e=new InputMismatchException(Error_msg_forATM.err3_amt_mismatch);
			System.out.println("\n"+e.getMessage());
		} 
		
		catch (AmountException e) 
		{
			// TODO Auto-generated catch block
			 System.out.println("\n"+e.getMessage());	 
		}
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("\n"+e.getMessage());
		}
		
		finally {
			System.out.println("\nPlease take back your ATM card");
		}
		
		toRepeat();
	}

	public void toRepeat() {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.println("\nDo you want to process again \n"+"\n1 - Withdrawal \n"+"\n2 - Cancel\n");
		try {
			
		int choice=sc.nextInt();
		
			switch(choice)
			{
				case 1:
					to_verify_pin();
					break;
				case 2:
					System.out.println("\nThank you, come again.");
					System.exit(0);
					break;
				default:
					throw new ChoiceException(Error_msg_forATM.err6_choiceInvalid);
			}
		}
		catch(InputMismatchException e)
		{
			e=new InputMismatchException(Error_msg_forATM.err3_amt_mismatch);
			System.out.println("\n"+e.getMessage());
		} 
		catch (ChoiceException e) {
			// TODO Auto-generated catch block
			System.out.println("\n"+e.getMessage());
			toRepeat();
		}
		
		finally {
			sc.close();
		}
	}

	public int toCheckDigit(int pin) {
		// TODO Auto-generated method stub
		int count=0;
		
		while(pin>0)
		{
			count++;
			pin=pin/10;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM_program obj=new ATM_program();
		obj.to_verify_pin();
	}

}
