

public class Vol extends Thread
{
	volatile boolean running=true;
	
	public void run()
	{
		while(running)
		{
			System.out.println("Hi ");
		}
	}

	void Shutdown()
	{
		running=false;
		System.out.println("Exit Loop");
	}
	


	public static void main(String args[])
	{
		Vol V=new Vol();
		V.start();
		V.Shutdown();
	}
}
	