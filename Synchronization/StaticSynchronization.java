
class BookSeat
{
	static int total_seat=20;
	static  synchronized void bookseat(int seat)
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
class mythread1 extends Thread
{
	BookSeat B;
	int seat;
	mythread1(BookSeat B,int seat)
	{
		this.B=B;
		this.seat=seat;
	}
		public void run()
		{
			B.bookseat(seat);
		}
}		

class mythread2 extends Thread
{
	BookSeat B;
	int seat;
	mythread2(BookSeat B,int seat)
	{
		this.B=B;
		this.seat=seat;
	}
		public void run()
		{
			B.bookseat(seat);
		}
}	



public class StaticSynchronization
{
	public static void main(String args[])
	{
		
		BookSeat B1=new BookSeat();
		mythread1 t1=new mythread1(B1,7);
		t1.start();
		mythread2  t2=new mythread2(B1,6);
		t2.start();
		
		//------------------------------------
		BookSeat B2=new BookSeat();
		mythread1 t3=new mythread1(B2,5);
		t3.start();
		mythread2  t4=new mythread2(B2,9);
		t4.start();
		
		//------------------------------------
		BookSeat B3=new BookSeat();
		mythread1 t5=new mythread1(B3,2);
		t5.start();
		mythread2  t6=new mythread2(B3,9);
		t6.start();
		
		
		
	}
	
}	
	