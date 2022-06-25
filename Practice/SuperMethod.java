

class A
{
	void Accept()
	{
	 System.out.println("this is a class A constructor");
	 }
}

public class SuperMethod extends A
{

		void Display()
		{
			super.Accept();
		}
		public static void main(String args[])
		{
			SuperMethod Sc=new SuperMethod();
			Sc.Display();
			
		}
}
	 