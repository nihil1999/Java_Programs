/**
 * 
 */
package string;

import java.util.Objects;

/**
 * @author logan
 *
 */
public class Student extends Info{

	/**
	 * @param args
	 */
	
	private String name;
	private int rollno;
	private int age;
	static Student s5;
	
	public Student(String name, int rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Logan", 1234,10);
//		Student s2=new Student("Logan", 1234,10);
//		Student s3=new Student("Suriya", 5678,20);
//		Student s4=new Student("Arun", 9876,30);
		
		
		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
		System.out.println(s5);
		
//		System.out.println(s1.equals(s2));	
//		System.out.println(s1.equals(s4));
	//	System.out.println(s1.equals(s5));
		
		Info obj=new Info();
		System.out.println(s1.equals(obj));
		
		//System.out.println(s1.hashCode());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, rollno);
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj==null)
		{
			return false;
		}
		
		if(getClass()!=obj.getClass())
		{
			return false;
		}
		Student other=(Student) obj;
		if(name.equals(other.name) && rollno==other.rollno && age==other.age )
			return true;
		return false;
	}
	


	public String toString()
	{
		return this.getName()+" "+this.getRollno()+" "+this.getAge();
	}

}
