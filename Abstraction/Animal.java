interface BasicAnimal
{
	void eat();

	
	void sleep();
	

}


public class Animal implements BasicAnimal
{
	public void eat()
	{
	
	System.out.println("basic animals eat a milk");
	}
		
	public void sleep()
	{
		System.out.println("animals sleep at 10 pm");
	}
	
	public static void main(String args[])
	{
		Animal obj=new Animal();
		obj.eat();
		obj.sleep();
		
		
		
		
	}
}