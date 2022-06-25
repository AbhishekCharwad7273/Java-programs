

public class CreateThread extends Thread
//public class CreateThread implements Runnable
{
	
	public void run()
	{
		System.out.println("Thread created using Thread class");
		//System.out.println("Thread created using Runnable Interface");
		try
		{
		Thread.sleep(1000);
		
		}
		catch(java.lang.Exception e)
		{
			
		}
		
		System.out.println(Thread.currentThread().getName());
		Thread.yield();
		
			Thread.currentThread().setPriority(7);	
			System.out.println(Thread.currentThread().getPriority());	
		
	}
	public static void main(String args[])throws InterruptedException
	{
		
		CreateThread CT=new CreateThread();
		 CT.start();
		//System.out.println(Thread.currentThread().getName());	
		Thread.currentThread().setName("Main Thread");	
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());	
		 
		//Thread T=new Thread(CT);
		//T.start();
		CT.join(10000);
	}
}

