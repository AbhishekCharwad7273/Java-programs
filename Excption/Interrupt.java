class Interrupt extends Thread

{
	public void run ()
	{
		try
		{
			
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);//Interrupt will only work when it will sleep or wait
			}
		}	
		catch(java.lang.Exception e)
			{
				System.out.println(e);
			}	
			
	}


	public static void main(String args[])
	{
		Interrupt I=new Interrupt();
		I.start();
		I.interrupt();
	}
}	