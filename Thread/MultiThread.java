
//1>performing single task from single thread


 //public class MultiThread extends Thread
public class MultiThread implements Runnable
{
	public void run()
	{
		//System.out.println("Thread task");	
		System.out.println("Thread task 2");	
	}
		public static void main(String args[])
		{
			MultiThread MT=new MultiThread();
			Thread T=new Thread(MT);
			
			//MT.start();
			T.start();		
		}
}		
			