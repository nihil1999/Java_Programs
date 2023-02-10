package Conditional;

import java.util.Scanner;

public class Switch {
	
	public void get_grade(char gradeValue)
	{
		switch(gradeValue)
		{
//		default:
//			System.out.println("Absent");
//			//break;
		case 'O':
			System.out.println("First class with distinction.");
			break;
		case 'A':
			System.out.println("First class.");
			break;
		case 'B':
			System.out.println("Second class.");
			break;
//		default:
//			System.out.println("Absent");
//			//break;
		case 'C':
			System.out.println("Third class.");
			break;
		case 'R':
			System.out.println("Reappearence.");
			break;
		default:
			System.out.println("Absent");
			//break;
		case '\0':
			System.out.println("Fail");
			//break;
		case '#':
			System.out.println("special character.");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5&4);
		Switch obj=new Switch();
//		Scanner s=new Scanner(System.in);
//		char value=s.nextLine();
		obj.get_grade('A');
		System.out.println("\n1 - Monday");
		System.out.println("2 - Tuesday");
		System.out.println("3 - Wednesday");
		System.out.println("4 - Thursday");
		System.out.println("5 - Friday");
		System.out.println("6 - Saturday");
		System.out.println("7 - Sunday\n");
		
		int days=3;
		System.out.println("My choice: " + days + "\n");
		
		switch(days)
		{
		
		//to check if it skips the above choices
		case 1:
			System.out.println("Monday");		//didn't give break here if it checks this choice then it is checking every choices, otherwise it will skip this.
		case 2:
			System.out.println("Tuesday");
			break;								//here break given so it will come out of the switch statement.
		case 3:
			System.out.println("Wednesday");    //here break didn't given so it will check the next statement too.
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
		}
		
		int value=4;
		switch(value) {
		case 2*3:
			System.out.println("1");
			break;
		case (2-7+1):
			System.out.println("2");
			break;
		case 4/2:
			System.out.println("3");
			break;
		case 2%1:
			System.out.println("4");
			break;
		case 5<<4:
			System.out.println((5&4) + "hello");
			break;
			
		default:
			System.out.println("0");
		}
		
		String name="ram";
		switch(name)
		{
		case "ram":
			System.out.println("name");
		}
	}

}
