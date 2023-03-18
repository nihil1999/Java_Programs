/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author logan
 *
 */
public class Mobile_Sorting {
	
	public static void main(String[] args) {
		
		ArrayList<Realme> realme=new ArrayList<>();
		
		realme.add(new Realme("Realme","Realme 5 pro","RM5P","Snapdragon 720",64,5000,128,8,18000));
		realme.add(new Realme("Realme","Realme 8 pro","RM8P","Snapdragon 860",108,6000,256,12,25000));
		realme.add(new Realme("Realme","Narzo","NAR1","Snapdragon 820",64,5500,128,6,15000));
		
		//System.out.println(realme);
		
		ArrayList<Redmi> redmi=new ArrayList<>();
		
		redmi.add(new Redmi("Redmi","Redmi 10 pro","RM10P","Mediatek helio G90",64,5600,128,8,20000));
		redmi.add(new Redmi("Redmi","Redmi 11 pro","RM11P","Mediatek helio G80",108,7000,256,12,22000));
		redmi.add(new Redmi("Redmi","Redmi 9","RM9","Mediatek helio G70",32,6500,128,6,19000));
		
		//System.out.println(redmi);
		
		ArrayList<Mobile> mobile=new ArrayList<>(redmi);
		mobile.addAll(realme);
		ArrayList<Mobile> tempMobile=new ArrayList<>(mobile);
		toChoose(tempMobile);
	}
	
	private static void toChoose(ArrayList<Mobile> mobile) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nDo you want to choose particular brand or view all mobiles : \n\n1. Choose brand \n2. List all mobiles");
		int choose=sc.nextInt();
		switch(choose)
		{
			case 1:
				displaybyBrand(mobile);
				break;
			case 2:
				System.out.println(mobile);
				toGetChoice(mobile);
				break;
			default:
				System.out.println("\nEnter right choice :");	
				toChoose(mobile);
				break;
		}	
	}
	
	private static void displaybyBrand(ArrayList<Mobile> mobile) {
		Scanner s=new Scanner(System.in);
		
		ArrayList<Mobile> mobileList=new ArrayList<>();
		ListIterator<Mobile> lir=mobile.listIterator();
		
		toListALLMobile(mobile);
		
		System.out.println("Choose Mobile Name: ");
		String mobName=s.nextLine();
		
		while(lir.hasNext())
		{
			Mobile m1=lir.next();
			if(m1.getBrand().equalsIgnoreCase(mobName))
			{
				mobileList.add(m1);
			}
		}
		System.out.println(mobileList);
		System.out.println("\nDo you want to filter: \n1.Yes \n2.No");
		int ch=s.nextInt();
			if(ch==1)
				toGetChoice(mobileList);	
	}
	
	private static void toListALLMobile(ArrayList<Mobile> mobile) 
	{
		TreeSet<String> allMobileList=new TreeSet<>(); 
		ListIterator<Mobile> lir=mobile.listIterator();
		
		while(lir.hasNext())
		{
			allMobileList.add(lir.next().getBrand());
		}
		System.out.println("List of mobiles available : \n"+allMobileList);
		
	}

	private static void toGetChoice(ArrayList<Mobile> mobile) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter choice to filter: \n");
		System.out.println("1.Sort by Brand name \n2.Sort by Ram \n3.Sort by Price \n4.Sort by Battery capacity");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				brandSorting(mobile);
				break;
			case 2:
				ramSorting(mobile);
				break;
			case 3:
				System.out.println("Do you want to enter price range or view by all prices? \n1.Yes \n2.No \nEnter any one number.\n");
				int priceChoice=sc.nextInt();
				switch(priceChoice)
				{
					case 1:
						System.out.println("Enter price range : ");
						long priceRange1=sc.nextLong();
						long priceRange2=sc.nextLong();
						priceRangeSorting(mobile,priceRange1,priceRange2);
						break;
					case 2:
						priceSorting(mobile);
						break;
					default:
						break;
				}
				
				break;
			case 4:
				batterySorting(mobile);
				break;
			default:
				System.out.println("\nEnter right choice");
				toGetChoice(mobile);
				break;
		}
		System.out.println("\nDo you want to filter again: \n1.Yes \n2.No");
		int ch=sc.nextInt();
			if(ch==1)
				toGetChoice(mobile);
	}

	public static void brandSorting(ArrayList<Mobile> mobile)
	{
		Comparator<Mobile> brandsorting=(Mobile m1,Mobile m2)-> 
		{
				if(m1.getBrand().compareTo(m2.getBrand())>0)
					return 1;
				else if(m1.getBrand().compareTo(m2.getBrand())<0)
					return -1;
				else 
					return 0;
		};
		
		Collections.sort(mobile,brandsorting);
		System.out.println("\nSort by Brand : \n"+mobile);
	}

	private static void batterySorting(ArrayList<Mobile> mobile) {
		Comparator<Mobile> batterysorting=(Mobile m1,Mobile m2)-> 
		{
				if(m1.getBattery()>(m2.getBattery()))
					return -1;
				else if(m1.getBattery()<(m2.getBattery()))
					return 1;
				else 
					return 0;
		};
		
		Collections.sort(mobile,batterysorting);
		System.out.println("\nSort by Battery capacity : \n"+mobile);
		
	}

	private static void ramSorting(ArrayList<Mobile> mobile) {
		Comparator<Mobile> ramsorting=(Mobile m1,Mobile m2)-> 
		{
				if(m1.getRam()>m2.getRam())
					return -1;
				else if(m1.getRam()<m2.getRam())
					return 1;
				else 
					return 0;
		};
		
		Collections.sort(mobile,ramsorting);
		System.out.println("\nSort by Ram : \n"+mobile);
			
	}
	
	private static void priceRangeSorting(ArrayList<Mobile> mobile, long priceRange1, long priceRange2) 
	{
		ArrayList<Mobile> priceRangeMobileList=new ArrayList<>();
		ListIterator<Mobile> lir=mobile.listIterator();
		
		while(lir.hasNext())
		{
			Mobile m=lir.next();
			if(m.getPrice()>=priceRange1 && m.getPrice()<=priceRange2)
			{
				priceRangeMobileList.add(m);
			}
		}
		priceSorting(priceRangeMobileList);
	}
	
	public static void priceSorting(ArrayList<Mobile> mobile)
	{
		Comparator<Mobile> pricesorting=(Mobile m1,Mobile m2)-> 
		{
				if(m1.getPrice()>m2.getPrice())
					return 1;
				else if(m1.getPrice()<m2.getPrice())
					return -1;
				else 
					return 0;
		};
		
		Collections.sort(mobile,pricesorting);
		System.out.println("\nSort by Price : \n"+mobile);
	}

}
