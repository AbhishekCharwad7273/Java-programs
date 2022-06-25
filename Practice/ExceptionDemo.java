

public class ExceptionDemo
{
	void Math()
	{
		int a=10,b=0;
		System.out.println(a/b);
	}
	
	public static void main(String args[])
	{
		ExceptionDemo E=new ExceptionDemo();
		try
		{
			E.Math();
		}
		
		catch(java.lang.Exception e)
		{
			System.out.println("Exception will Handle");
			e.printStackTrace();
		}
	}
}
