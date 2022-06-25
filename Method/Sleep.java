class Sleep extends Thread

{
	/*public void run()//Excutation of Child Thread
	{
		Thread.currentThread().setName("child thread Execution");
		System.out.println(Thread.currentThread().getName());
		for (int i=1;i<=5;i++)//Execution pause of main thread
		{
			try
			{
				Thread.sleep(1000);
			System.out.println(i);
			}
			catch (java.lang.Exception e)
			{
			System.out.println(e);
			}	
		}
	}*/	
	public static void main(String args[])
	{
		Thread.currentThread().setName("parent thread Execution");
		System.out.println(Thread.currentThread().getName());
		for (int i=1;i<=59;i++)//Execution pause of main thread
		{
			for(int j=1;j<=59;j++)
			{	
				try
				{
					Thread.sleep(1000);
					System.out.println(j);
				}
				catch (java.lang.Exception e)
				{
					System.out.println(e);
				}
			}
				System.out.println("\n");
			
		}	
			//Sleep S=new Sleep();
			//S.start();
		
	}
}
	