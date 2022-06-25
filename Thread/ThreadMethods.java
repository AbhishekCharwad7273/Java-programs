

class X extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			 Thread.yield();
			System.out.println("\t From Thread X: i="+i);
		}
		
		System.out.println("\t exit From X");
	}
}

	
class Y extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("\t From Thread Y: j="+j);
			if(j==3)
			stop();	
			
		}
		
		System.out.println("\t exit From Y");
	}
	
}	

class Z extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
		{
			System.out.println("\t From Thread Z: k="+k);
			if(k==1)
			{
				try
				{
					sleep(2000);
				}
				catch(Exception e)
				{
				}
				
			}	
			
		}
		
		System.out.println("\t exit From Z");
		
	}
	
}	

	

public class ThreadMethods
{
	public static void main(String args[])
	{
		X x=new X();
		Y y=new Y();
		Z z=new Z();
		
		System.out.println("Start Thread X");
		x.start();
		
		System.out.println("Start Thread Y");
		y.start();
		
		System.out.println("Start Thread Z");
		z.start();
	
		System.out.println("End of main thread");
	}
}
		
		
	
	
	