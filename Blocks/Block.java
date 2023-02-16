package Blocks;

public class Block {
	
	int a;
	
	static {						
		System.out.println("Static block 1");    //static block is executed first.
	}
	
	static {
		System.out.println("Static block 2");
	}
	
	{							//instance initializer
		a=10;
		System.out.println("non-static block");			//every time executed when object is created.
	}

//	Block()
//	{
//		System.out.println("Constructor");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block obj=new Block();
		Block obj1=new Block();
		System.out.println(obj.a);
		obj1.a=15;				//we need to change the value here for other object field.
		System.out.println(obj1.a);
		System.out.println(obj.a);
	}

}
