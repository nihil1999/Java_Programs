/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to count every character
 */
public class Count_ofEvery_character {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public void toCount_DuplicateCharacter()
	{
		System.out.println("Enter string:");
		String str=sc.nextLine();
		char ch[]=new char[str.length()];
		int count;
		int index1=0;
		
		for(int i=0;i<str.length();i++)
		{
			count=1;
			if(!(toCheck2(str.charAt(i),ch,index1)) && str.charAt(i)!=' ')
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						ch[index1]=str.charAt(i);
						index1++;
						count++;
					}
				}
				
				System.out.println("\nDuplicate character is '"+str.charAt(i)+"' and count is : "+count);  //to print the count of every character.
			}
		}
	}

	private boolean toCheck2(char searchelement, char[] ch, int index1) {
		// TODO Auto-generated method stub
		for(int i=0;i<index1;i++)
		{
			if(searchelement==ch[i])
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_ofEvery_character obj=new Count_ofEvery_character();
		obj.toCount_DuplicateCharacter();
	}

}
