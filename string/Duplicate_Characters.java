/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author logan
 *to print the duplicate characters in a string.
 */
public class Duplicate_Characters {

	/**
	 * @param args
	 */
	
	Scanner sc=new Scanner(System.in);
	
	public void toFind_Duplicate_characters()
	{
		System.out.println("\n-------------This is to find the duplicate characters:--------------\n");
		System.out.println("Enter string:");
		String s=sc.nextLine();
		System.out.println("\nThe string is \""+s+"\"\n");
		String str=s.toLowerCase();
		boolean flag=false;
		
		char c[]=new char[str.length()];
		int index=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(!(toCheck(str.charAt(i),c,index)) && str.charAt(i)!=' ')			//here i checks if the repeated character comes again or not if it comes then it'll skip to next iteration. becauz it enters into inner loop when the condition trues.
			{																	//if the character repeats then it will give true and not(!) changes it to false.
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						System.out.println("Duplicate character is "+str.charAt(i));
						c[index]=str.charAt(i);			//here i'm assigning the repeated character to char array to check afterwards if the repeated character comes again or not.
						index++;						//increasing the index of char array.
						flag=true;					//to know if there are repeated characters
						break;						//to only print the repeated characters so i give break after finding it, if don't give break means the repeated letter will again prints. 
					}
				}
			}
		}
		if(flag==false)
			System.out.println("'No repeated characters'");
	}
	
	private boolean toCheck(char searchelement, char[] c,int index) {		//passing the character one by one and checking with char array checking untill the index value, becauz initially space will be in all array index.
		// TODO Auto-generated method stub
		
		for(int i=0;i<index;i++)
		{
			if(searchelement==c[i])
				return true;
		}
		
		return false;
	}
	
//to count the repeated character 	
	public void toCount_DuplicateCharacter()
	{
		System.out.println("\n-------------This is to count the repeated characters and which repeats most:--------------\n");
		System.out.println("Enter string:");
		String s=sc.nextLine();
		System.out.println("\nThe string is \""+s+"\"\n");
		
		String str=s.toLowerCase();
		
		char ch[]=new char[str.length()];
		int count;
		int index1=0,first=0,second=0;
		char c=' ';
		boolean flag=false;
		char arr[]=new char[str.length()];
		int array[]=new int[str.length()];
		int index_count=0; 
		
		
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
				
				if(count!=1)			// to print the repeated characters occurred count.
				{
					System.out.println("Duplicate character is "+str.charAt(i)+" and count is : "+count);
					first=count;					// repeated character count will be assigned to first variable.
					flag=true;
					
//method 1:													//to find which character occured most 
					if(first>second)				//first count will be in first variable and second holds 0, if the next repeating character's count is greater than the previous character then it'll swap to second. 
					{
						int temp=second;			
						second=first;			//second will holds the max count finally, if next repeating character's count is maximum then it'll be stored in second...
						first=temp;
						c=str.charAt(i);		//it holds the maximum count's(second) character.
					}
					
//method 2:		storing count and repeated character in an array
					array[index_count]=count;
					arr[index_count]=str.charAt(i);
					index_count++;
				}
			}
		}
		
		if(flag==false)
			System.out.println("'No repeated characters'");
		else
		System.out.println("\nThe character which occured highest is '"+c+"' : "+second);
		
//for method 2:
		int max=Integer.MIN_VALUE,find=0;
		for(int i=0;i<array.length;i++)
		{
				if(max<array[i])			//finding which count is maximum 
					{
						max=array[i];
						find=i;				//storing the index of max in find variable, becuz that index's character is maximum.
					}
		}
		System.out.println("\nThe character which occured highest is '"+arr[find]+"' : "+max);
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
		Duplicate_Characters obj=new Duplicate_Characters();
		obj.toFind_Duplicate_characters();
		obj.toCount_DuplicateCharacter();
	}

}
