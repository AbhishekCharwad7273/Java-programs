class Ticket
{
	int total_ticket=10;
	
	synchronized void book(int seat)
	{
		if(total_ticket>=seat)
		{
			System.out.println(seat+ " Seats are Book");
			total_ticket=total_ticket-seat;
			System.out.println(total_ticket+" Seats are remaining");
		}
		else
		{
			System.out.println("Seats are Full");
		}
	}
}

public class Sycn extends Thread
{
	int seat;
	static Ticket T;
	public void run()
	{
		T.book(seat);
	}
	
	public static void main(String args[])
	{
		T=new Ticket();
		
		Sycn S=new Sycn();
		S.seat=7;
		S.start();
		
		Sycn S1=new Sycn();
		S1.seat=3;
		S1.start();
	}
}
		
		
