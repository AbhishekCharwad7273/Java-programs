
class BookSeat
{
	int total_seat=10;
	synchronized void bookseat(int seat)
	//void bookseat(int seat)
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
	}
}
	
class Synchronization extends Thread

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
			Synchronization A=new Synchronization();
			A.seat=7;
			A.start();
			
			
			
			Synchronization B=new Synchronization();
			B.seat=6;
			B.start() ;
		}	
}	