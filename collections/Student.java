/**
 * 
 */
package collections;

/**
 * @author logan
 *
 */
public class Student implements Comparable<Object> {

	/**
	 * @param args
	 */
	Integer i;
	private int roll;
	private int age;
	private int mark;
	private String name;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", mark=" + mark + ", name=" + name + "]";
	}

	public Student(int roll, int age, int mark, String name) {
		super();
		this.roll = roll;
		this.age = age;
		this.mark = mark;
		this.name = name;
	}

	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}

	/**
	 * @param roll the roll to set
	 */
	public void setRoll(int roll) {
		this.roll = roll;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the mark
	 */
	public int getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(int mark) {
		this.mark = mark;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		
	}

	@Override
	public int compareTo(Object o) {
		
		 Student s = (Student)o;
		    if( this.getMark()  >s.getMark()){
		    	return 9;
		    }
		    else if (this.getMark()<s.getMark()) {
		    	return -99;
		    }
		    else
		return 0;
	}

}
