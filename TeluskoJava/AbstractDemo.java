
 /*abstract class Human
{
	
	public abstract void walk();
	
	void run()
	{
		
	}	


}
*/
 
 //class Man extends Human//concrete class
class Human
{
	public  void walk(Number i)//Number it is abstract class it will accept all int , float, double value
	{
		System.out.println("walk in Ground");
		
	}

}	


public class AbstractDemo
{
	
	public static void main(String args[])
	
	{
		
		Human obj=new Human();
		obj.walk(10.25);
		
	}

}	