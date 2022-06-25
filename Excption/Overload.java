public class Overload
{
	public static void main(int x)
	{
		System.out.println("int in main method");
	}
	
	public static void main(String args[])
	{
		System.out.println("String in main method");
		Overload o=new Overload();
		o.main(12);
	}
}
