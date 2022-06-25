
class test
{
	
	test(ThisMethods Td)
	{
		System.out.println("This constructor pass as an Argument");
	}
	
}
public class ThisMethods
{
	void Accept()
	{
		System.out.println("hello java");
	}
	
	void display()
	{
		this.Accept();
		test t=new test(this);
	}
	
	void M1(ThisMethods TM)
	{
		System.out.println("this pass as a argument");
	}
	
	void M2()
	{
		M1(this);
	}
	
	
	public static void main(String args[])
	{
		ThisMethods TM=new ThisMethods();
		TM.display();
		TM.M2();
	}
}
