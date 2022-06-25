class Medical extends Thread

{
		

	public void run()
	{
			//System.out.println("A1"+Thread.interrupted());
			System.out.println("B1"+Thread.currentThread().isInterrupted());
			try
			{
					
			System.out.println("Medical Started");
			Thread.sleep(3000);
			System.out.println("Medical End");
			}
			catch (java.lang.Exception e)
			{
			System.out.println(e);
			}	
		}
}
 

class TestDrive extends Thread

{
		
	
	public void run()
	{
			try
			{
					
			System.out.println("Drive Started");
			Thread.sleep(3000);
			System.out.println("Drive End");
			}
			catch (java.lang.Exception e)
			{
			System.out.println(e);
			}	
		}
} 



class Officer extends Thread

{
		

	public void run()
	{
			
			try
			{
					
			System.out.println("officer Demo Started");
			Thread.sleep(3000);
			System.out.println("Officer Demo End");
			}
			catch (java.lang.Exception e)
			{
			System.out.println(e);
			}	
		}
}


public class JoinLicenceDemo
{
	public static void main(String args[])throws InterruptedException
	{
		Medical M=new Medical();
		M.start();
		M.interrupt();
		M.join(1000);
		TestDrive T=new TestDrive();
		T.start();
		T.join();
		Officer O=new Officer();
		O.start();
	}
}	