
class GoodMorning extends Thread
{
	public void run()
	{
		System.out.println("GoodMorning");
	}
}	

class Welcome extends Thread
{
	public void run()
	{
		try
			{
					
			System.out.println("Welcome");
			Thread.sleep(200);
			System.out.println("Exit");
			}
			catch (java.lang.Exception e)
			{
			System.out.println(e);
			}	
	}
}	



 class ThreadDemo
{
	public static void main(String args[])
	{
		System.out.println("main thread priority:-"+Thread.currentThread().getPriority());
		GoodMorning GM=new GoodMorning();
		GM.start();
		Welcome W=new Welcome();
		W.start();
	}
}	