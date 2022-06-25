
class BookTicket
{
	static int total_seat=20;
	
	static synchronized void book (int seat)
	{
		if(total_seat>=seat)
		{
			System.out.println(seat+"Seats are book Successfully");
			total_seat=total_seat-seat;
			System.out.println(total_seat+"remaining Seats are");
		}
		
		else
		{
			System.out.println("Seats are not book Successfully");
			System.out.println(total_seat+"remaining Seats are ");
		}
	}
}


class MyThread extends Thread
{
	BookTicket B;
	int seat;
	MyThread(BookTicket B,int seat)
	{
		this.B=B;
		this.seat=seat;
	}
	
	public void run()
	{
		B.book(seat);
	}
	
	
	
}


class MyThread1 extends Thread
{
	BookTicket B;
	int seat;
	MyThread1(BookTicket B,int seat)
	{
		this.B=B;
		this.seat=seat;
	}
	
	public void run()
	{
		B.book(seat);
	}
	
	
	
}



public class BookApp
{
	
	public static void main(String args[])
	{
			BookTicket BT=new BookTicket();
			MyThread B1=new MyThread(BT,8);
			B1.start();
			MyThread1 B2=new MyThread1(BT,6);
			B2.start();
			
			
			BookTicket BK=new BookTicket();
			MyThread B3=new MyThread(BK,8);
			B3.start();
			MyThread1 B4=new MyThread1(BK,6);
			B4.start();
			
		
	
	}
	
}
