

interface Demo

{
	
	int a=10;//-->whenever we create variable in interface it will be constant could not changed
	static void show()
	{
		System.out.print("static in interface");
		
	}
}
	





public class StaticInterface
{
	public static void main(String args[])
	{
		
			Demo.show();//->we can also called interface using static method
		
	}

}	