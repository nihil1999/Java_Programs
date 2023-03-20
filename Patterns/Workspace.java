package Patterns;

public class Workspace {

	public static void main(String[] args) {
		int range=5;
		int count=range;
		for(int i=1;i<=range;i++)
		{
			
			for(int j=range;j>=range-i+1;j--)
			{
				System.out.print(count);
			}
			count--;
			System.out.println();
		}
		int count1=range;
		for(int i=1;i<=range;i++)
		{
			
			for(int j=1;j<=range;j++)
			{
				if(j>=range-i+1)
				System.out.print(count1);
				else
					System.out.print(" ");
			}
			count1--;
			System.out.println();
		}

	}

}
