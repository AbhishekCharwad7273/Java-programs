

public class ThisConstructor
{
	ThisConstructor()
	{
		this(30);
		System.out.println("This is a constructor");
	}
	
	ThisConstructor(int a)
	{
		//this();
		System.out.println("This is a Parameterized Constructor");
	}
	
	
	public static void main(String args[])
	{
		ThisConstructor Tc=new ThisConstructor();
		ThisConstructor TC=new ThisConstructor(20);
		
	}
}