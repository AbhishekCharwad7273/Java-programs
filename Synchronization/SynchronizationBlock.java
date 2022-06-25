
class BookSeat
{
	int total_seat=10;
	//synchronized void bookseat(int seat)
	 void bookseat(int seat)
	{
		System.out.println("hi:-"+Thread.currentThread().getName());
		System.out.println("hi:-"+Thread.currentThread().getName());
		System.out.println("hi:-"+Thread.currentThread().getName());
		System.out.println("hi:-"+Thread.currentThread().getName());
		System.out.println("hi:-"+Thread.currentThread().getName());
		synchronized (this)//this is reference of an getName object
		{
			if(total_seat>=seat)
			{
				System.out.println(seat+"Seat are book");
				total_seat=total_seat-seat;
				System.out.println("seat left"+total_seat);
			}
			
			else
			{
				System.out.println("Seat are not book");
				System.out.println("Seat Remaining "+total_seat);
			}
			System.out.println("hi:-"+Thread.currentThread().getName());
			System.out.println("hi:-"+Thread.currentThread().getName());
			System.out.println("hi:-"+Thread.currentThread().getName());
			System.out.println("hi:-"+Thread.currentThread().getName());
			System.out.println("hi:-"+Thread.currentThread().getName());
		}		
	}
}
	
class SynchronizationBlock extends Thread

{
		static BookSeat B;
		int seat;
		public void run()
		{
			B.bookseat(seat);
		}
		 public static void main(String args[])
		{
			B=new BookSeat();
			SynchronizationBlock A=new SynchronizationBlock();
			A.seat=7;
			A.start();
			
			
			
			SynchronizationBlock B=new SynchronizationBlock();
			B.seat=6;
			B.start() ;
		}	
}	