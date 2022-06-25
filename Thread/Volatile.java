

class demo extends Thread
{
	
	 volatile boolean running=true;
	
	public void run()
	{
		while(running)
		{
			System.out.println("Heloo");
		}
	}


	public void shutdown()
	{
		System.out.println("After the calling Shutdown Method");
		//running=false;
	}
	
}



public class Volatile
{
	public static void main(String args[])
	{
			demo obj=new demo();
			obj.start();
			obj.shutdown();
	}
	
}