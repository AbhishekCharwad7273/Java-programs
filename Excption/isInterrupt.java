class isInterrupt extends Thread

{
	public void run ()
	{
		System.out.println("A1"+Thread.interrupted());// it will change the interrupted status thats why code will run
		System.out.println("A2"+Thread.interrupted());//true ->false
		System.out.println("B1"+Thread.currentThread().isInterrupted());//it will cannot change the Status interrupt()
		System.out.println("B2"+Thread.currentThread().isInterrupted());
	
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println("C :"+Thread.interrupted());
			}
		}	
		catch(java.lang.Exception e)
			{
				System.out.println("Thread Interrupted:"+e);
			}	
			
	}


	public static void main(String args[])
	{
		isInterrupt I=new isInterrupt();
		I.start();
		I.interrupt();
	}
}	