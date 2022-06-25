class Yeild extends Thread
{
	public void run()
	{
		Thread.yield();
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"   "+i);
		}
	}


		public static void main(String args[])
		{
			Yeild Y=new Yeild();
			Y.start();
			//Thread.yield();
			for (int i=1;i<=5;i++)
			{
				
				System.out.println("main Thread   "+i);
			}
		}
}