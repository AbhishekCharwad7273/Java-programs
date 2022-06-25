
class A
{
	public A()
	{
		System.out.println("im A default Constructor");
	}


	public A(int i)
		
	{

		System.out.println("A as a Parameterized constructor");

	}
}
	

class B extends A
{
	public B()
	{
		
		super(2);
		System.out.println("im B default Constructor");
	}


	public B(int i)
		
	{
		super(1);
		System.out.println("B as a Parameterized constructor");

	}
}
	





public class SuperDemo
{
	public static void main(String args[])
	
	{
		
		B obj=new B();
		
		
	}

}	