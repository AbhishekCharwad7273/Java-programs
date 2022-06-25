class Join extends Thread

{
		
	static  Thread MainThread;
	public void run()
	{
	
	
		for (int i=1;i<=5;i++)//Execution pause of main thread
		{
			try
			{
				MainThread.join();
				System.out.println("Child Thread:-"+i);
				Thread.sleep(1000);
			
			}
			catch (java.lang.Exception e)
			{
				System.out.println(e);
			}	
		}
	}
	public static void main(String args[])throws InterruptedException
	{
				MainThread=Thread.currentThread();//main thread reference
				Join J=new Join();
				J.start();
				//J.join();
			for (int i=1;i<=5;i++)
			{
							
				try
				{
					System.out.println("Parent Thread:-"+i);
					Thread.sleep(1000);
					//J.join();
				}
				catch (java.lang.Exception e)
				{
					System.out.println(e);
				}
			
			
			
		}	
			
		
	}
}
	