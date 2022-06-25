class A
{
		A()
		{
			System.out.println("This is A Class Constructor");
		}
}

public class Constructor extends A
{
	Constructor()
	{
		System.out.println("This is a Class Constructor");
	}
	
	public static void main(String args[])
	{

		Constructor obj1=new Constructor();
	}
}
