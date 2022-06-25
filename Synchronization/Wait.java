class totalearnings extends Thread

{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
		
				for(int i=1;i<=10;i++)
				{
					total=total+100;
				}
			this.notify();
		}
	}
}	

public class Wait
{
	public static void main(String args[])throws InterruptedException	
	{
		totalearnings t=new totalearnings();
		t.start();
		try
		{
			synchronized (t)
			{
				t.wait();
			}
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}	
		
		System.out.println("total earning is "+t.total+" rs ");
	}
	

}