
class Outer
{
	int a;
	
	void show()
	{
		
	}
	
	
	
	class Inner
	{
		void display()
		{
			System.out.println("in inner class");
		}
	}	
}
	

public class InnerDemo
{
	
	public static void main(String args[])
	{
			Outer obj=new Outer();
			obj.show();
			
			
			Outer.Inner obj1=obj.new Inner();
			obj1.display();
	}	


	
}
	