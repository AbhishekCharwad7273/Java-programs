
interface demo//-->functional interface has only one abstract method but any no of default method
{
	public void show();
	
	default void display()
	{
		System.out.println("using default we can create a body of interface");
	}
}

class CallInterface implements demo
{
	

		public void show()
		{
			

			System.out.println("show in call");
			
		}
		
		public void display()//-->default method should be override
		{
			System.out.println("Display call interface");
		}	

}			
			





public class DefaultDemo
{
	public static void main(String args[])
	{
		
			demo obj=new CallInterface();//->we cannot crete obj for interface but we will create reference
			obj.show();
			obj.display();
	}

}	