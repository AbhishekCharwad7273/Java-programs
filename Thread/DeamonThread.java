public class DeamonThread extends Thread
 {
	public void run()
	{
		
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread");
		}
		else
		{	
			System.out.println("child thread");
		}	
	
	}
	
	public static void main(String args[])
	{
		System.out.println("main thread");
		DeamonThread DT=new DeamonThread();
		//DT.setDaemon(true);//-->is Deamon thread
		DT.setDaemon(false);//-->is Not deamon thread
		DT.start();
	}
 }	
		