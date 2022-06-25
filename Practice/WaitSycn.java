class totalearnings extends Thread

{
	int total=0;
	public void run()
	{
		
		synchronized(this)//this can be used referance of Object
		{
			
		
				for(int i=1;i<=10;i++)
				{
					total=total+100;
				}
		}
		this.notify();
	}
}	

public class WaitSycn
{
	public static void main(String args[])throws InterruptedException	
	{
		totalearnings t=new totalearnings();
		t.start();
		try
		{
			synchronized(t)
			{
				t.wait();
				System.out.println("total earning is "+t.total+" rs ");
			}
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}
	}
	

}
