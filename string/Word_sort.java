/**
 * 
 */
package string;

/**
 * @author logan
 *
 */
public class Word_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"ram","arun","logan","wolverine","Ajay","Aravindh","Bala"};
		for(String i:str)
		System.out.print(i+" ");
		String temp;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println();
		for(String i:str)
			System.out.print(i+" ");
		toCompare(str);
		
	}

	private static void toCompare(String[] str) {
		// TODO Auto-generated method stub
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i;j<str.length;j++)
			{
				for(int k=0;k<str[i].length();k++)
				{
					if(str[i].charAt(k)>str[j].charAt(k))
						break;
					else if((int)str[i].charAt(k)<(int)str[j].charAt(k))
					{
						temp=str[i];
						str[i]=str[j];
						str[j]=temp;
						break;
					}
				}
			}
		}
		System.out.println();
		for(String i:str)
		System.out.print(i+" ");
		
	}

}
