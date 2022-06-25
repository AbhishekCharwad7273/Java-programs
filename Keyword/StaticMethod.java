	class Test
{
	static int i=10;
	int j=20;
	static void show()
	{
	abc();//2>static method can access only static method
	System.out.println("this is Test static method");
	System.out.println(i);//1>static method can access only static data
	}
	static void abc()
	{
		System.out.println("heeloo");
		//System.out.println("this"+this.j);//this,super keyword cannot used in static method
	}
	
	
	
}	



class StaticMethod
{

	static void display()
	{
	
	System.out.println("this is static method");
	
	}
	
	public static void main(String args[])
	{
		display();//we can directly called static method without create a object 
		Test.show();
	}
}	