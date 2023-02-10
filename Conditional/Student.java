package Conditional;

public class Student {

	int tam,eng,mat,sci,soc;
	static float total;
	static String result;
	static char grade;
	
	public Student(int tam, int eng, int mat, int sci, int soc) {
		// TODO Auto-generated constructor stub
		this.tam=tam;
		this.eng=eng;
		this.mat=mat;
		this.sci=sci;
		this.soc=soc;
	}

	public float get_total()
	{
		float total=this.tam+this.eng+this.mat+this.sci+this.soc;
		return total;
	}
	
	public String check_passOrFail()
	{
		if(this.tam>=35 && this.eng>=35 && this.mat>=35 && this.sci>=35 && this.soc>=35)
			{
			//System.out.println("Pass");
		    return "Pass";
			}
		else
			{
			//System.out.println("Fail");
			return "Fail";
			}
	}
	
	public char get_grades(float total,String result)
	{
		if(result=="Pass")
		{
			if(total>450)
				return 'O';
			else if(total>400 && total<=450)
				return 'A';
			else if(total>300 && total<=400)
				return 'B';
			else if(total>=175 && total<=300)
				return 'C';
			else
				return '\0';
		}
		else
			return 'F';
	}
	
	private void display(float total, String result, char grade) {
		// TODO Auto-generated method stub
		System.out.println("Total mark: " + total + "\n" + "Result: " + result + "\n" + "Grade: " + grade + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Ram=new Student(90,80,78,84,73);
		total=Ram.get_total();
		result=Ram.check_passOrFail();
		grade=Ram.get_grades(total, result);
		Ram.display(total,result,grade);
		
		Student Ravi=new Student(35,40,58,24,73);
		total=Ravi.get_total();
		result=Ravi.check_passOrFail();
		grade=Ravi.get_grades(total, result);
		Ram.display(total,result,grade);

	}
}
