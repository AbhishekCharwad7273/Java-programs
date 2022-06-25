class MultiThreadSleep extends Thread
{
	public void run()
	{	
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+"    " + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}	
		catch(java.lang.Exception e)
		{	
			System.out.println(e);
		}	
	}
		
	public static void main(String args[])
	{
		MultiThreadSleep M=new MultiThreadSleep();
		M.start();
		MultiThreadSleep Ms1=new MultiThreadSleep();
		Ms1.start();
	}
}	