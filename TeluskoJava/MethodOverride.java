  
class A

{
	void show()
	{
		System.out.println("A in show");
		
	}

}


class B extends A

{

		void show()
	{
		super.show();
		System.out.println("B in show");
		
	}
	
}	
		
		

public class MethodOverride
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
		
	}

}	