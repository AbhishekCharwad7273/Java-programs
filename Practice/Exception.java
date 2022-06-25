import java.lang.Exception;

public class Exception
{
	public static void main(String args[])
	{
	
	int a=10;
	int b=0;
	try
	{
		System.out.println("I am in Try Block");
		System.out.println(a/b);
		System.out.println("Exit Try block");
	}
	
	catch(java.lang.Exception e)
	
	{
		System.out.println("Exception can be handle");
	}
	
	finally
	{
		System.out.println("All resources are closed");
	}
	
	
	
	
	}
}