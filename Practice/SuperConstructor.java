

class A
{
	A()
	{
	 System.out.println("this is a class A constructor");
	 }
}

public class SuperConstructor extends A
{

		SuperConstructor()
		{
			super();
		}
		public static void main(String args[])
		{
			SuperConstructor Sc=new SuperConstructor();
			
		}
}
	 