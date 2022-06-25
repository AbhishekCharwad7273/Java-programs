
class BookSeat extends Thread
{
	int total_seat=10;
	synchronized void run(int seat)
	//public void run(int seat)
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
	
class Synchronizations extends Thread

{
	
		int seat;
		
		public static void main(String args[])
		{
			BookSeat BS	=new BookSeat();
			BS.start(seat);
			
			Synchronizations A=new Synchronizations();
			A.seat=7;
			A.start();
			
			
			
			Synchronizations B=new Synchronizations();
			B.seat=6;
			B.start() ;
		}	
}	