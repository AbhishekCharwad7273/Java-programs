


class Book
{
		int total_seat=10;
		
		synchronized  void book(int seat)
		{
			if(total_seat>=seat)
			{
				System.out.println("Seats Book Successfully");
				total_seat=total_seat-seat;
				System.out.println("Seats remaining :"+total_seat);
			}
			
			else
			{
				System.out.println("seat are not book ");
				System.out.println("remaining seat"+total_seat);
			}
		}
}	
		
	public class BookTicket extends Thread
	{		
	
		static Book B;
		int seat;
		public void run()
		{
			B.book(seat);
		}
		public static void main(String args[])
		{
			B=new Book();
			BookTicket obj=new BookTicket();
			obj.seat=7;
			obj.start();
			
			BookTicket obj1=new BookTicket();
			obj1.seat=7;
			obj1.start();
		}
		
}


