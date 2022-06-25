


class Earnings extends Thread
{
	int total_earnings=0;
	
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				total_earnings=total_earnings+100;
			
			}
			this.notify();
		}		
	}
}


public class InterThread
{
	public static void main(String args[])
	{
		Earnings obj=new Earnings();
		obj.start();
		
		
		synchronized(obj)
		{
			try
			{
				obj.wait();
				System.out.println("total_earnings is:-"+obj.total_earnings);
			}
			
			catch(java.lang.Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}
	
}