


class Bookseat
{
	
	int total_seat=10;
	
	void book(int seat)
	{
		
		synchronized(this)
		{
			if(total_seat>=seat)
			{
				System.out.println(seat+":-Seats are book Successfully");
				total_seat=total_seat-seat;
				System.out.println(total_seat+":-Remaining seat are");
			}
		
			else
			{
				System.out.println("Seats are Not book ");
				System.out.println(total_seat+":-remaining Seat are");
			}
		}
	}
}


public class SycnDemo extends Thread
{

		static Bookseat B;
		int seat;
		
		public void run()
		{
			B.book(seat);
		}
		
		public static void main(String args[])
		{
			B=new Bookseat();
			SycnDemo S=new SycnDemo();
			S.seat=8;
			S.start();
			
			SycnDemo S1=new SycnDemo();
			S1.seat=6;
			S1.start();
		}
}
