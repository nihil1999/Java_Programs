/**
 * 
 */
package Patterns;

/**
 * @author logan
 *
 */
public class Numbers_sideBy {

	/**
	 * @param args
	 */
	
	public void toPrint_Numbers()
	{
		int arr[][]=new int[5][13];
		int mid1=0,mid2=0;
		if(arr[0].length%2==0)
			{
				mid1=arr[0].length/2-2;
				mid2=arr[0].length/2+1;
			}
		else
		{
			mid1=arr[0].length/2-1;
			mid2=arr[0].length/2+1;
		}
		
		int middle1=mid1/2,middle2=mid2+(arr[0].length-1-mid2)/2;
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(col<=mid1)
				{
					if(row==0 || col==0 || row== arr.length-1 || col==mid1 )
						System.out.print("* ");
						else
							System.out.print("  ");
				}
				else if(col>=mid2)
				{
					if(col==middle2 )
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers_sideBy obj=new Numbers_sideBy();
		obj.toPrint_Numbers();

		int temp=0;
		
		int row_length=9;
		int col_length=7;
		int row_mid=row_length/2;
		
		for(int i=1;i<10;i++)
		{
			temp=i;
		switch(temp) {
		
		case 0:
			System.out.println("  ");
		for(int row=0;row<row_length;row++)			
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || col==0 || row== row_length-1|| col==col_length-1 )
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		break;
		
		case 1:
			System.out.println();
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(col==col_length/2 )
					System.out.print("* ");
				else if(row<row_mid && col==col_length/2-row )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		case 2:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || row==row_mid || row==row_length-1)
					System.out.print("* ");
				else if(row<row_mid && col==col_length-1)
					System.out.print("* ");
				else if(row>row_mid && col==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		break;
		
		case 3:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || row==row_mid || row==row_length-1 || col==col_length-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		case 4:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row<=row_mid && col==col_length-row-3)
					System.out.print("* ");
				else if(row==row_mid+1 || col==col_length-2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		case 5:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || row==row_mid || row==row_length-1)
					System.out.print("* ");
				else if(row>row_mid && col==col_length-1)
					System.out.print("* ");
				else if(row<row_mid && col==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		case 6:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || row==row_mid || row==row_length-1 || col==0)
					System.out.print("* ");
				else if(row>row_mid && col==col_length-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		case 7:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || col==col_length-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		case 8:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || row==row_mid || row==row_length-1 || col==0 || col==col_length-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		case 9:
		System.out.println("\n");
		for(int row=0;row<row_length;row++)
		{
			for(int col=0;col<col_length;col++)
			{
				if(row==0 || row==row_mid || col==col_length-1)
					System.out.print("* ");
				else if(row<row_mid && col==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		break;
		
		default:
			System.out.println("Enter valid number ");
		}
	}

}
}
