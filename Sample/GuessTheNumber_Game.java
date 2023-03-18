/**
 * 
 */
package Sample;

import java.util.Random;
import java.util.Scanner;

/**
 * @author logan
 *
 */
public class GuessTheNumber_Game {

	/**
	 * @param args
	 */
	
	Scanner sc;
	//int arr1[];
	int arr2[];
	int count[];
	int range=4;
	
	public int[] toGetRandom_Number()
	{
		
//		Random r=new Random();
//		
//		int num=0;
//		arr1=new int[range];
//		
//		for(int i=0;i<range;i++)
//		{
//			arr1[i]=r.nextInt(9);
//		}
		
		int arr1[]= {1,2,3,4};
		
		count=new int[range];
		
		
		for(int i=0;i<arr1.length;i++)
		{
			int index=0,j=i;
			while(index<i)
			{
				if(arr1[i]==arr1[index])
				{
					count[i]=0;
					j=arr1.length;
				}
				index++;
			}
			
			for(;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					count[i]+=1;
				}
			}
		}
	
//		for(int i:arr1)
//			System.out.print(i+" ");
//		System.out.println();
//		for(int i:count)
//			System.out.print(i+" ");
		
		return arr1;
	}
	
	public void toGetUser_Number(int[] arr1)
	{
		sc=new Scanner(System.in);
		
		System.out.println("\nEnter number to guess: ");
		try{
			
			String str=sc.nextLine();
			
			//int num=sc.nextInt();
			//System.out.println(num);
			//arr2=toReturnNumber_asArray(num);
			
//			for(int i=0;i<str.length();i++)
//			{
//				if(!(str.charAt(i)>='0' && str.charAt(i)<='9'))
//					throw new GuessNumberException(Error_msg_GuessNumber.err2_input_mismatch);
//			}
			
			arr2=new int[range];
			
//			if(str.length()!=4)
//			{
//				//throw new GuessNumberException(Error_msg_GuessNumber.err1_input_mismatch);
//			}
	
			for(int i=0;i<str.length();i++)
			{
				int temp=str.charAt(i);
				arr2[i]=temp-48;
			}
			
			//int count_user[]=new int[range];
			
//			
//			for(int i=0;i<arr2.length;i++)
//			{
//				int index=0,j=i;
//				while(index<i)
//				{
//					if(arr2[i]==arr2[index])
//					{
//						count_user[i]=0;
//						j=arr2.length;
//					}
//					index++;
//				}
//				
//				for(;j<arr2.length;j++)
//				{
//					if(arr2[i]==arr2[j])
//					{
//						count_user[i]+=1;
//					}
//				}
//			}
			
			System.out.println();
			for(int i:arr2)
				System.out.print(i+" ");
//			System.out.println();
//			for(int i:count_user)
//				System.out.print(i+" ");
			
			toGuessNumber(arr1);
		
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e=new ArrayIndexOutOfBoundsException(Error_msg_GuessNumber.err1_input_mismatch);
//			System.out.println(e.getMessage());
//			toGetUser_Number(arr1);
//		} 
//		catch (GuessNumberException e) 
//		{
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			toGetUser_Number(arr1);
//		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}		
	}
	
  public void toGuessNumber(int arr1[])
	{
		char ch[]=new char[range];
		int check=0;
		int count_user[]=new int[range];
		
		for(int i=0;i<arr2.length;i++)
		{
			/*for(int j=i;j<=i;j++)
			{*/
				if(arr2[i]==arr1[i])
				{
					ch[i]='c';
					check++;
					//count_user[i]+=1;
					toUser_Count(arr2[i],count_user);
				}
			//}
		}
		
		if(check==4)
		{
			{
				System.out.println();
				
				for(char i:ch)
					System.out.print(i+" ");
			}
			System.out.println("\nGame over.");
		}
		else
		{
			for(int i=0;i<arr2.length;i++)
			{
					int j=0,index=0;
					boolean value=false;
													
//						while(index<i)				//to check if the number is presents before, if it presents then the outer loop(j) will start from (i)index.
//						{								//the loop will run until i index. 
//							if(arr2[i]==arr2[index])
//								{
//									j=i;				
//								}
//							index++;
//						}
					
				//toUser_Count(arr2[i],count_user);
					
				if(ch[i]!='c') {
					toUser_Count(arr2[i],count_user);
					
					while(index<i)				//to check if the number is presents before, if it presents then the outer loop(j) will start from (i)index.
						{								//the loop will run until i index. 
							if(arr2[i]==arr2[index] && ch[index]=='p')
								{
									
									if(count_user[toFindNumber(arr2[i])]>count[toGetCount(arr2[i],arr1)])
									{
										//ch[i]='x';
										j=arr1.length;
										//count_user++;
									}
								}
							index++;
						}
					
				for(;j<arr1.length;j++)
				{
//					if(arr2[i]==arr1[j] && i==j)			//if user number and random number are same and their index also same, then it will indicate as c.
//					{
//						ch[i]='c';
//						break;
//					}
//					else if(arr2[i]==arr1[j])				//if user number and random number are same but their index is different, then it will indicate as p.
//					{
//						ch[i]='p';
//						break;
//					}
					
					if(arr2[i]==arr1[j] && ch[j]!='c')				//if user number and random number are same but their index is different, then it will indicate as p.
					{
						ch[i]='p';
						value=true;
						//count_user[toFindNumber(arr2[i])]+=1;
						break;
					}
				}
				
				if(j==arr1.length && value!=true)//&& ch[i]!='c')							//if user number not same as random number, then it will indicate as x.
					ch[i]='x';
				
				}
			}
			
			boolean flag=true;
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]!='c')
				{
					flag=false;
				}
			}
			
			if(flag==false)
			{
				System.out.println();
				
				for(char i:ch)
					System.out.print(i+" ");
				
				System.out.println();
				
				for(int i:count_user)
					System.out.print(i+" ");
				toGetUser_Number(arr1);
			}
			
			else
			{
				System.out.println();
				
				for(char i:ch)
					System.out.print(i+" ");
			}
		}
		
	}
  
  private void toUser_Count(int num, int[] count_user) {
	// TODO Auto-generated method stub
	  for(int i=0;i<arr2.length;i++)
	  {
		  if(num==arr2[i])
		  {
			  count_user[i]+=1;
			  break;
		  }
		  
	  }
}

private int toFindNumber(int num) {
	// TODO Auto-generated method stub
	  int i=0;
	  for(;i<arr2.length;i++)
	  {
		  if(num==arr2[i])
			  return i;
	  }
	return i;
}

private int toGetCount(int num,int[] arr1) {
	// TODO Auto-generated method stub
	  
	  int i=0;
	  for(;i<arr1.length;i++)
	  {
		  if(num==arr1[i])
		  {
			  return i;
		  }
	  }
	  
	return i;
}

//public int[] toReturnNumber_asArray(int num)
//	{
//		int num1=num;
//		int mul=1;
//		count=0;
//		while(num1>0)
//		{
//			num1/=10;
//			mul*=10;
//			count++;
//		}
//		mul/=10;
//		
//		int a[]=new int[count];
//		int index=0;
//		
////		while(num>0)
////		{
////			a[index]=num/mul;
////			num%=mul;
////			mul/=10;
////			index++;
////		}
//		
//		int i=a.length-1;
//		while(num>0)
//		{
//			a[i]=num%10;
//			num/=10;
//			i--;
//		}
//		
//		return a;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessTheNumber_Game obj=new GuessTheNumber_Game();
		int arr[]=obj.toGetRandom_Number();
		obj.toGetUser_Number(arr);
		
	}

}
