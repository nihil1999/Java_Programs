package Interface;

public class College extends Anna_University {

	public College() {
		// super();
		System.out.println("Constructor in College");

	}

	public void get_approve() { // TODO Auto-generated method stub
		System.out.println("This is an AICTE approved college");
	}

	@Override
	public void get_grades() {
		// TODO Auto-generated method stub
		System.out.println("Grades are given by college by the instruction of ANNNA UNIVERSITY");
	}

	public void leave_announce() {
		System.out.println("Holidays announced by college.");
	}

	public static void main(String arg[]) {

		Aicte obj = new College();
		obj.get_approve();
		obj.get_certificate_verified();
		obj.get_grades();
		obj.leave_announce();
		System.out.println(Aicte.fees);

	}

}

