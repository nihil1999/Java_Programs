/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Password_validation {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	
	public void toValidate_Password()
	{
		System.out.println("Enter password:");
		String pwd=sc.nextLine();
		System.out.println(pwd);
		
		boolean flag1=false,flag2=false,flag3=false,flag4=false;
		
		for(int i=0;i<pwd.length();i++)
		{
		  if(pwd.length()>=8) 
		  { 
			if(pwd.charAt(i)>='A' && pwd.charAt(i)<='Z')
				flag1=true;
			else if(pwd.charAt(i)>='a' && pwd.charAt(i)<='z')
				flag2=true;
			else if(pwd.charAt(i)>='0' && pwd.charAt(i)<='9')
				flag3=true;
			else if(pwd.charAt(i)>=32 && pwd.charAt(i)<=47 || pwd.charAt(i)>=58 && pwd.charAt(i)<=64 || pwd.charAt(i)>=91 && pwd.charAt(i)<=96 || pwd.charAt(i)>=123 && pwd.charAt(i)<=126)
				flag4=true;
		  }
		  else
		  {
			  System.out.println("Password must have 8 letters.");
			  break;
		  }
		  
		}
		
	if(flag1==true && flag2==true && flag3==true && flag4==true)
		System.out.println("Password is valid.");
	else
		System.out.println("Password is not valid.");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password_validation obj=new Password_validation();
		obj.toValidate_Password();
	}

}