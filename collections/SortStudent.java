package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudent {

	
	
	
	public static void main(String[] args) {

			List <Student> l= new ArrayList<>();
			
			l.add(new Student(34,21,543,"Alex"));
			l.add(new Student(14,22,555,"Benito"));
			l.add(new Student(65,28,345,"Arun"));
			l.add(new Student(2,20,123,"Nehil"));
			l.add(new Student(23,19,862,"Praveen"));
			l.add(new Student(55,29,541,"Chandru"));
			
			System.out.println("Before Sorting");
			System.out.println(l);
			Comparator <Student>c = new NameComparator();//implemting comparator interface
			
			Comparator <Student>a = new Comparator<Student>() // anonymous class
					{
				public  int compare(Student s1, Student s2) {
					 if(s1.getMark()>s2.getMark())
						 return 9;
					 else if(s1.getMark()<s2.getMark())
						 return -9;
					 else 
					 return 0;
				 }
					}			
					;
			Comparator <Student>ageSort = (Student s1, Student s2)-> {// lamda expression
			
				 if(s1.getAge()>s2.getAge())
					 return 9;
				 else if(s1.getAge()<s2.getAge())
					 return -9;
				 else 
				 return 0;
			};
			
			Collections.sort(l);
			
			System.out.println(l);
			
			
			/*
			 * Collections.sort(l,c); System.out.println("After Sorting");
			 * System.out.println(l); Collections.sort(l,a);
			 * System.out.println("After Mark Sorting"); System.out.println(l);
			 * Collections.sort(l,ageSort); System.out.println("After Age Sorting");
			 * System.out.println(l);
			 */
	}

}
