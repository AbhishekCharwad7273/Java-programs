
public class DeamonDemo extends Thread
{
	
	public void run()
	
	{
		if(Thread.currentThread().isDaemon())
		{
				System.out.println("IS deamon Thread ");
		}
		else
		{
			System.out.println("is Not Deamon");
			
			
		}
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Main Thread");
		DeamonDemo D=new DeamonDemo();
		D.setDaemon(true);
		//D.setDaemon(false);
		D.start();
		
		
	}
}


	
	