import java.util.*;

public class LeapYear

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Year");
		int  year=sc.nextInt();
		
		if(year%400==0)
			
		{
			System.out.println("year is leap year");
		}
			else if(year%4==0)
			
		{
			System.out.println("year is leap year");
		}
			else if( year%100==0)
			
		{
			System.out.println("year is leap year");
		}
		
		
		else
		{
				System.out.println("Year is Not Leap year");
				
		}
	}
}	
			
	
			
				