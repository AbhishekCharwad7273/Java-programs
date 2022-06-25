
//2>performing single task from Multiple thread
 public class MultiThread1 extends Thread
{
	public void run()
	{
		//System.out.println("Thread task");	
		System.out.println("Thread task 2");	
	}
		public static void main(String args[])//Main Thread
		{
			MultiThread1 MT=new MultiThread1();//Thread 1
			MultiThread1 MT1=new MultiThread1();//Thread 2
			
			MT.start();
			MT1.start();
					
		}
}		
			