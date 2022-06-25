import java.util.*;

public class WebSite

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the WebSite Name");
		String name=sc.nextLine();
		
		if(name.endsWith(".com"))
			
		{
			System.out.println("Its Commercial Website");
		}
			else if(name.endsWith(".org"))
			
		{
			System.out.println("it is Organisational Website");
		}
			else if(name.endsWith(".in"))
			
		{
			System.out.println("it is an indian Website");
		}
		
		
		else
		{
				System.out.println("Wrong Website");
				
		}
	}
}	
			
	
			
				