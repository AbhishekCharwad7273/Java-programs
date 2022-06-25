


class Bookseat
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

class Mythread1 extends Thread
{
	Bookseat B;
	int seat;
	
	Mythread1(Bookseat B,int seat)
	{
		this.B=B;
		this.seat=seat;
	}
	
	
	public void run()
	{
		B.book(seat);
	}
	
}

class Mythread2 extends Thread
{
	Bookseat B;
	int seat;
	
	Mythread2(Bookseat B,int seat)
	{
		this.B=B;
		this.seat=seat;
	}
	
	
	public void run()
	{
		B.book(seat);
	}
	
}


public class StaticSycn
{
	public static void main(String args[])
	{
		Bookseat B1=new Bookseat();
		Mythread1 M=new Mythread1(B1,9);
		M.start();
		Mythread2 M1=new Mythread2(B1,8);
		M1.start();
	
		Bookseat B2=new Bookseat();
		Mythread1 M2=new Mythread1(B2,8);
		M2.start();
		Mythread2 M3=new Mythread2(B2,5);
		M3.start();
	}
}
	
	
	
	
	
	