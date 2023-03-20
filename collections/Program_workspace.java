/**
 * 
 */
package collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class Program_workspace {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		toRemoveDuplicates();
		toGetRepeatedElements();
		toGetNonRepeatedElements();
		toGetInputFromUser();
		toStoreOnlyInteger();
		toChangeSetIntoArray();
		toRotateListLeft();
		toRotateListRight();
		toCountOccurenceOfList();
	}

	private static void toCountOccurenceOfList() {
		System.out.println();
		ArrayList<Integer> numberSet=new ArrayList<>();
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(4);
		numberSet.add(4);
		numberSet.add(3);
		numberSet.add(1);
		numberSet.add(4);
		System.out.println("List : "+numberSet);
		HashMap<Integer,Integer> occurenceList=new HashMap<>();
		Iterator<Integer> itr=numberSet.iterator();
		while(itr.hasNext())
		{
			int count=1;
			int num=itr.next();
			if(occurenceList.containsKey(num))
				occurenceList.put(num,occurenceList.get(num)+1);
			else
				occurenceList.put(num,count);
		}
		System.out.println("Occurence in a list : "+occurenceList);
		
	}

	private static void toRotateListLeft() {
		System.out.println();
		ArrayList<Integer> numberSet=new ArrayList<>();
		
		for(int i=1;i<=5;i++)
		numberSet.add(i);
		
		System.out.println("\nList : "+numberSet);
		int rotationCount=2;
		while(rotationCount>0)
		{
			rotationCount--;
			int num=numberSet.get(0);
			numberSet.remove(0);
			numberSet.add(num);
		}
		System.out.println("Left Rotation of a List : "+numberSet);
	}
	
	private static void toRotateListRight() {
		
		ArrayList<Integer> numberSet=new ArrayList<>();
		
		for(int i=1;i<=5;i++)
		numberSet.add(i);
		
		System.out.println("\nList : "+numberSet);
		int rotationCount=2;
		while(rotationCount>0)
		{
			rotationCount--;
			int num=numberSet.get(numberSet.size()-1);
			numberSet.remove(numberSet.size()-1);
			numberSet.add(0,num);
		}
		System.out.println("Right Rotation of a List : "+numberSet);
	}

	private static void toChangeSetIntoArray() {
		System.out.println();
		HashSet<Integer> numberSet=new HashSet<>();
		
		for(int i=1;i<=10;i++)
		numberSet.add(i);
		
		System.out.println(numberSet);
		Integer[] numberArray=new Integer[numberSet.size()];
		Iterator<Integer> litr=numberSet.iterator();
		int index=0;
		while(litr.hasNext())
		{
			numberArray[index]=litr.next();
			index++;
		}
		System.out.println("Converting set to Array : ");
		for(int i:numberArray)
		System.out.print(i+" ");
	}

	private static void toStoreOnlyInteger() {
		System.out.println();
		ArrayList<Object> allList=new ArrayList<>();
		ArrayList<Integer> integerList=new ArrayList<>();
		ArrayList<Character> characterList=new ArrayList<>();
		ArrayList<String> stringList=new ArrayList<>();
		
		allList.add("hai");
		allList.add(24);
		allList.add("hello");
		allList.add(2);
		allList.add('c');
		allList.add('@');
		allList.add(5.5);
		allList.add(true);
		allList.add(100);
		
		ListIterator<Object> itr=allList.listIterator();
		
		Integer i=65;
		Character c='a';
		String s="";
		System.out.println("List : "+allList);
		
/*by using get class method*/		
//		while(itr.hasNext())
//		{
//			Object x=itr.next();
//			if(x.getClass()==i.getClass())
//				integerList.add((int)x);
//			else if(x.getClass()==c.getClass())
//				characterList.add((char)x);
//			else if(x.getClass()==s.getClass())
//				stringList.add((String)x);
//			
//		}

/*by using instance of*/
		while(itr.hasNext())
		{
			Object x=itr.next();
			if(x instanceof Integer)
				integerList.add((Integer)x);
			else if(x instanceof Character)
				characterList.add((Character)x);
			else if(x instanceof String)
				stringList.add((String)x);
		}
		System.out.println("Integer list : "+integerList);
		System.out.println("Character list : "+characterList);
		System.out.println("String list : "+stringList);
	}

	private static void toGetInputFromUser() throws IOException {
		System.out.println();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> userList=new ArrayList<>();
		String str="";
		System.out.println("\nEnter string : ");
//		while(!str.equals("exit"))
//		{
//			str=sc.nextLine();
//			if(!str.equals("exit"))
//				userList.add(str);
//		}
//		while(str!=null)
//		{
//			str=sc.nextLine();
//			if(str.equals("exit"))
//				break;
//			else
//				userList.add(str);
//
//		}
//		System.out.println(userList);
		//FileWriter fw=new FileWriter("New_file_using_scanner",true);
		while(!sc.hasNext("exit"))
		{
			str=sc.nextLine();
			userList.add(str);
			//fw.write(str);
		}
		//fw.flush();
		//fw.close();
		System.out.println("List with inputs from user : "+userList);
		
	}

	private static void toGetNonRepeatedElements() {
		System.out.println();
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(4);
		al.add(5);
		al.add(1);
		al.add(3);
		System.out.println(al);
		ListIterator<Integer> itr=al.listIterator();
		HashSet<Integer> hs=new HashSet<>();
		ArrayList<Integer> duplicateList=new ArrayList<>();
		ArrayList<Integer> nonDuplicateList=new ArrayList<>();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(!hs.add(i))
				duplicateList.add(i);
		}
		//System.out.println("Duplicate elements in a list : "+duplicateList);
		while(itr.hasPrevious())
		{
			Integer i=itr.previous();
			if(!duplicateList.contains(i))
				nonDuplicateList.add(i);
		}
		System.out.println("Non repeated elements in a list : "+nonDuplicateList);
		
	}

	private static void toGetRepeatedElements() {
		System.out.println();
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(4);
		al.add(5);
		al.add(1);
		al.add(3);
		System.out.println(al);
		Iterator<Integer> itr=al.iterator();
		HashSet<Integer> hs=new HashSet<>();
		ArrayList<Integer> duplicateList=new ArrayList<>();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(!hs.add(i))
				duplicateList.add(i);
		}
		System.out.println("Duplicate elements in a list : "+duplicateList);
		
	}

	private static void toRemoveDuplicates() 
	{
		System.out.println();
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(1);
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList<>();
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(!al1.contains(i))
				al1.add(i);
		}
		System.out.println("List without repeated elements : "+al1);	
	}

}
