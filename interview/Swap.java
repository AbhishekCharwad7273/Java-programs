//2>how to Swap two number without create 3rd temp variable

public class Swap
{
	public static void main(String args[])
	{
		
		int a=10;
		int b=20;
		
		b=b-a;
		a=b+a;
		System.out.println("after Swap a number are"+a);
		System.out.println("after Swap b number are"+b);
		
	}
}