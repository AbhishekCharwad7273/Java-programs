

public class ThrowDemo
{
	void Math()
	{
		int a=10,b=0;
		System.out.println(a/b);
	}
	
	public static void main(String args[])
	{
		ExceptionDemo E=new ExceptionDemo();
		E.Math();
		
		throw new ArithmeticException();//exception object will created by user not jvm
	
	}
}
