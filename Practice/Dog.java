
 class Animal
{
	void Display()
	{
		System.out.println("Which Type Of Animal");
	}
}

public class Dog extends Animal
{
	public void Bark()
	{
			System.out.println("Dog is Barking");
	}
	public static void main(String args[])
	{
		
		Dog obj=new Dog();
		obj.Display();
		obj.Bark();
	}
	

}

	