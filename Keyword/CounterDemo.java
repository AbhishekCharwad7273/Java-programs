

public class CounterDemo
{
	 static int count=0;
	CounterDemo()
	{
		count++;
		System.out.println(count);
	}
	
	static void display()
	{
		System.out.println("heloo");
	}
	
	
	public static void main(String args[])
	{
		CounterDemo obj1=new CounterDemo();
		CounterDemo obj2=new CounterDemo();
		CounterDemo obj3=new CounterDemo();
		CounterDemo obj4=new CounterDemo();
		CounterDemo.display(); 
	}
}