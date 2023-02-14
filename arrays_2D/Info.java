/**
 * 
 */
package arrays_2D;

/**
 * @author logan
 *
 */
public class Info {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info obj=new Info();
		int arr[][]=new int[3][4];
		
		System.out.println(arr.length);
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=i+1;
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}	
		
		System.out.println();
		int count=1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count;
				System.out.print(arr[i][j]+ " ");
				count++;
			}
			System.out.println();
		}
	}

}
