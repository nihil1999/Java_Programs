package Loop;

public class PrintNumbers {
	
	public void printNumberby4(int limit)
	{
		int num=1;
		while(num<=limit)
		{
			System.out.print(num + " ");
			num+=3;
		}
	}
	
	public void printNumbersby5(int limit)
	{
		System.out.println();
		int num=1;
		while(num<=limit)
		{
			System.out.print(num + " ");
			num+=4;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers obj=new PrintNumbers();
		obj.printNumberby4(22);
		obj.printNumbersby5(33);
	}

}
