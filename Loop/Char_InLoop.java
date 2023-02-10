package Loop;

public class Char_InLoop {
	
	public void print_alphabet()
	{
		
//Directly printing alphabet
		for(char i='A';i<='z';i++)
		{
			if(i>='A' && i<='Z' || i>='a' && i<='z' )
			System.out.print(i + " ");
			if(i=='Z' || i=='z')
				System.out.println();
		}

//by ASCII value
		for(char i=65;i<=122;i++)
		{
			if(i>='A' && i<='Z' || i>='a' && i<='z' )
			System.out.print(i + " ");
			if(i=='Z' || i=='z')
				System.out.println();
		}

//starting with alphabet but loop condition ending with number(ASCII)
		for(char i='A';i<=122;i++)
		{
			if(i>=65 && i<=90 || i>=97 && i<=122 )
			System.out.print(i + " ");
			if(i=='Z' || i=='z')
				System.out.println();
		}
		
//		for(int i=65;i<=122;i++)
//		{
//			 i=(char)i;
//			if(i>=65 && i<=90 || i>=97 && i<=122 )
//			System.out.print(i + " ");
//			if(i=='Z' || i=='z')
//				System.out.println();
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Char_InLoop obj=new Char_InLoop();
	//	obj.print_alphabet();
		int a=66;			
		char b=(char) a;
		//char c=a;		//integer datatype variable assigned to char datatype - gives error: can't convert from int to char.
		char d=97;		//here integer converts to char.
		int no=(char)a;	//integer typecasted to char and assigned to integer.
		int num=b;

		
		System.out.println(a+" "+b+" "+no+" "+num+" "+d);
		System.out.println((char)a);
		
		
		char value='A';
		int number=value;	//char datatype variable assigned to integer.
		int number1=(int)value;
		//char val=(int)value; //char typecasted to integer and assigned to char - gives error:can't convert from int to char.
		//char val=number1;
		int n='A';
		System.out.println(value+" "+number+" "+number1+" "+n);
		System.out.println((int)value);
		//char ch='3';
//		int i=ch-'0';
//		System.out.println((int)ch);
//		System.out.println(i);

//		int y=6;
//		float z=y;
//		//int w=(float)y;
//		System.out.println(z);
		
		for(boolean i=false;i!=true;i=true)
		{
			System.out.println(i);
			//System.exit(5);
		}
		
		for(int i=1;i!=6;i++)
		{
			System.out.println(i);
			//System.exit(0);
		}
		
		for(float i=1.0f;i<=2.0f;i=i+0.1f)
		{
			System.out.print(String.format("%7f", i) + " ");
		}
		System.out.println();
		for(float i=1.0f;i<=2.0f;i=i+0.1f)
		{
			System.out.print(String.format("%.2f", i) + " ");
		}
		System.out.println();
//		for(float i=1.0f;i<=2.0f;i=i+0.1f)
//		{
//			System.out.print(String.format("%0.2f", i) + " ");
//		}
		
		System.out.print(String.format("%.1f",5f) + " ");
		float in=10;
		System.out.println(String.format("%.1f",in) + " ");
		System.out.println();
	}

}
