class ThreadMethod extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("Abhi");
		System.out.println("Task Started");
		System.out.println(Thread.currentThread().getName());
	
	}
	
	public static void main(String args[])
	{
		//System.out.println(Thread.currentThread().getName());
		//Thread.currentThread().setName("Abhi");
		//System.out.println(Thread.currentThread().getName());
		//System.out.println(10/0);
		ThreadMethod TM=new ThreadMethod();
		TM.start();
		//TM.setName("SMART");
		//System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(TM.isAlive());
	}
}	