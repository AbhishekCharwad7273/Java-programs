class Priority extends Thread
{
	public void run()
	{
		System.out.println("Priority Of Thread");
		System.out.println("child thread priority:-"+Thread.currentThread().getPriority());	//child thread  priority same as main thread priority before setPriority
		Thread.currentThread().setPriority(8);
		System.out.println("after change child thread priority:-"+Thread.currentThread().getPriority());		
	}
		
	public static void main(String args[])
	{
		System.out.println("main thread priority:-"+Thread.currentThread().getPriority());//main thread priority by default print 5
		Thread.currentThread().setPriority(10);
		System.out.println("after set main thread priority:-"+Thread.currentThread().getPriority());
		Priority P=new Priority();
		P.start();
		//Thread.currentThread().setPriority(8);
		
		//System.out.println("after change child thread priority:-"+Thread.currentThread().getPriority());		
	}
}	