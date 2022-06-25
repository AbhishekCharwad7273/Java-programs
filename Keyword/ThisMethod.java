

public class ThisMethod
{

	void accept()
	{
		System.out.println("Hello");
	}
	
	void display()
	{
		//accept();//here this keyword automatically assign the method by compiler
		this.accept();
	}
	
	public static void main(String args[])
	{
		ThisMethod t=new ThisMethod();
		
		t.display();
	}
}