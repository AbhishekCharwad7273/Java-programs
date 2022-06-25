
public class MethodOverloading
{
	
	static void math()
	{
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println("Addition is "+ c );
	}
		
	static void math(int a,int b)
	{
			System.out.println("division  is"+ a/b);
	}
	static void math(int c)
	{
		
	System.out.println("division  is"+ (c*c));
	
	}
public static void main(String args[])
{
	math();
	math(15,5);
	math(5); 
}	
}