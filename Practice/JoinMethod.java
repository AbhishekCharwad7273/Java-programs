


class OnlineExam extends Thread
{
	public void run()
	{
		
		try
		{
			System.out.println("Appered Exam");
			Thread.sleep(1000);
			System.out.println("Exam pass Successfully");
		}
		catch(java.lang.Exception e)
		{
					System.out.println(e);	
		}

		
	
	}
}

class Medical extends Thread
{
	public void run()
	{
		
		try
		{
			System.out.println("Check Medical");
			Thread.sleep(1000);
			System.out.println("Medically Cleared");
		}
		catch(java.lang.Exception e)
		{
				System.out.println(e);
			
		}
	
		
		
	}
}


class DriveExam extends Thread
{
	public void run()
	{
		
		try
		{
			System.out.println("Drive the car");
			Thread.sleep(1000);
			System.out.println("Drive Exam Pass successfully and Give licence");
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
			
		}
		
		
	}
}


public class JoinMethod
{
	public static void main(String args[])throws InterruptedException
	{
		OnlineExam o=new OnlineExam();
		o.start();
		o.join();
		
		Medical M=new Medical();
		M.start();
		M.join();
		
		
		DriveExam D=new DriveExam();
		D.start();
		
	}
}

