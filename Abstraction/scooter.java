abstract class Vehicle
{	
	abstract void start();
	{
		int i=10;
		System.out.println("hello"+10);
	}
	
	static void show()
	{
			System.out.println("Show vehicle name");
	}	
	
}

class car extends Vehicle
{
	void start()
	{
		System.out.println("Car Start with Keys");
	}
}	

class scooter extends Vehicle
{
	void start()
	{
		System.out.println("scooter Start with Kicks");
	}
	
	public static void main(String args[])
	{
	car c=new car();
	c.start();
	scooter s=new scooter();
	s.start(); 
	s.show();	
	}	
}
