package Conditional;

public class PostIncrement {
	
	public int increment(int num)
	{
		System.out.println(num);
		num++;
		if(num==6)
		System.out.println(num);
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostIncrement obj=new PostIncrement();
		System.out.println(obj.increment(5));
	}

}
