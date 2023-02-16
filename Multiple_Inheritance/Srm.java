package Multiple_Inheritance;

public class Srm implements Anna_University, Aicte {

	public Srm() {
		// super();
		System.out.println("Constructor in Srm");

	}

	public void get_approve() { // TODO Auto-generated method stub
		System.out.println("This is an AICTE approved college.");
	}

	@Override
	public void get_grades() {
		// TODO Auto-generated method stub
		System.out.println("Grades are given by Srm by the instruction of ANNNA UNIVERSITY");
	}

	public void leave_announce() {
		System.out.println("Holidays announced by Srm.");
	}

	@Override
	public void get_certificate_verified() {
		// TODO Auto-generated method stub
		System.out.println("Student certificates are verified by ANNA UNIVERSITY ");
	}

	public static void main(String arg[]) {

		Aicte obj = new Srm();
		obj.get_approve();
		obj.get_certificate_verified();
		obj.get_grades();
		obj.leave_announce();
		System.out.println(Aicte.fees);

	}

}
