		

//final class test//final class cannot be inherited

class test
{
	//final void F1();//final method cannot override
		void F1()
		{
		System.out.println("Heloo");	
		}	
}	








class FinalDemo extends test

{
		void F1()
		{
			super.F1();	
		System.out.println("Heloo world");	
		}	

	public static void main(String args[])
	{
		//final int a=10;with variable final
		int a=10;	
		a=a+15;
		System.out.println(a);
		FinalDemo F=new FinalDemo();
		F.F1();
		
	
	}
}	