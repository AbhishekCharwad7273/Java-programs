import java.util.Scanner;


public class Website
{
	public static void main(String args[])
	{	
		System.out.println("enter the websites name");
		Scanner sc=new Scanner(System.in);
		String website=sc.next();
		if(website.endsWith(".org"))
		{
			System.out.println("this is an oraganisational websites");
		}
		else if(website.endsWith(".com"))
		{
			System.out.println("this is an commertial websites");
		}	
			
		else if(website.endsWith(".in"))
		{
			System.out.println("this is an indian websites");
		}
		else
		{
			System.out.println("wrong websites");
		}
	}
}	