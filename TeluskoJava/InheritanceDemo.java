
class calc//------------------------->Super Class ,parent class,base class
{
	public int add(int x,int y)
	{
		return x+y;
	}
}

class calculator extends calc//------>Sub class,Child class,Derived class

{

	public int sub(int x,int y)
	{
		return x-y;
		
	}
}
	
	
class AdvCalculator extends calculator//--->Achieved Multilevel inheritance
{

		public int multi(int x, int y)
		{
			return x*y;
		}

}		
		
//when extends is called Is-A relationship

public class InheritanceDemo//object Access is called Has-A Relationship
{
	public static void main(String args[])
	
	{
			AdvCalculator obj=new AdvCalculator();
			System.out.println(obj.add(12,54));
			System.out.println(obj.sub(52,41));
			System.out.println(obj.multi(12,5));
	}

}	