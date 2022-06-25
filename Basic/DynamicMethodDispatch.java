class Phone

{
	void on()
	{
		System.out.println("Turn on Phone");
	}

	void Showtime()
	{
		System.out.println("time is 11.40 am");
	
	}
}

class SmartPhone extends Phone
{
	void on()
	{

		System.out.println("Turn on SmartPhone");
	}
	void Music()
	{
		System.out.println("play the Music");
	}
}
public class DynamicMethodDispatch
{
	public static void main(String args[])
	{
		Phone obj=new SmartPhone();
		SmartPhone sobj=new SmartPhone();
		obj.on();//It will run bcz MethodOverriding 	
		obj.Showtime();
		sobj.Music();
	//obj.Music();//It will could not work bcz obj will create a base class
}

}	