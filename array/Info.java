package array;


public class Info {
	
//length - variable to store the size of the array that the user gives.
//array minimum size is 0. 
//array maximum size for all primitive datatype is range of integer
//index starts with 0 in array ,max index= length-1;
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Instance initializer block");
	}
		
	public void array(int Rollno[])				//passing array as an parameter.
	{
		System.out.println("Method");
		int value=101;
		for(int i=1;i<=Rollno.length-1;i++)		//obj.length
		{
			Rollno[i]=value;				//assigning value 
			value++;
		}
		
		for(int i=0;i<=Rollno.length-1;i++)
		{
			System.out.println(i+ " = " + Rollno[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//In main method first args length 0 bcauz we don't give any string in the console.If we give any strings in console then args length changes.  
		
		System.out.println(args.getClass());		//prints the class of the args object.
		System.out.println(args.length);			//prints the length of the args
		
		for(int i=0;i<=args.length-1;i++)
		{
			System.out.println(args[i] + " ");		//prints the string of the args that given in the console.
		}
		
//		int z=10;
//		System.out.println(z.getClass());		//gives error: can't invoke getclass() bcauz we can't call a method by variable.
		
//		if(args[0]!="Logan")		//for security purpose : if the given argument in the console not matches this then the JVM will terminate.
//			System.exit(0);			//To terminate the JVM (0)-status if we give 0 then it is normal termination other than that it is abnormal termination..
//
//				else      //if the argument matches then the program will execute.
//		{
		
		Info obj=new Info();
	//	System.out.println(obj.getClass());	//will display the class of the given object with package. 

		int[] Rollno=new int[10];		//array creation Rollno -object, int[length]. int[] - Abstract data type this class from native(c++).
//		System.out.println(Rollno.getClass());	//it prints the class of Rollno i.e. class [I ([-indicates array)
//		float[] a=new float[10];
//		System.out.println(a.getClass());
//		double[] Roll=new double[10];
//		System.out.println(Roll.getClass());
//		char[] ch=new char[10];
//		System.out.println(ch.getClass());
//		boolean[] flag=new boolean[10];
//		System.out.println(flag.getClass());
//		long[] no=new long[10];
//		System.out.println(no.getClass());
//		short[] b=new short[10];
//		System.out.println(b.getClass());
//		byte[] c=new byte[10];
//		System.out.println(c.getClass());
		
//		System.out.println("Index value ");
//		for(int i=0;i<=Rollno.length+1;i++)
//		{
//			System.out.print(i + " ");
//		}
//		System.out.println("\nDefault value for Rollno ");
//		for(int i=0;i<=Rollno.length-1;i++)
//		{
//			System.out.print(Rollno[i] + " ");
//		}
//
	//	Integer Age[]=new Integer[2147483647-2];
	//	System.out.println(Age.getClass());
		obj.array(Rollno);			//passing array as an argument
		//System.out.println(Rollno[5]);
		//System.out.println(args.length);
		
		Info arr[]=new Info[10];		//creating array for a class.
		System.out.println(arr.getClass());
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i] + " ");
		}
//max value for an datatype
		
		System.out.println(Integer.MAX_VALUE);  
		System.out.println(Float.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		int array[]=new int[0];
		System.out.println(array.length);
		
		
//		int[] num=new int[0];
//		System.out.println(num[0]);
//		for(int i=0;i<=num.length+1;i++)
//		{
//			System.out.print(num[i] + " ");
//		}
		
	}
	
	
}
