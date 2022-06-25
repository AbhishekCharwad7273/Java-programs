//create a userdefined Exception

import java.util.*;

 class AgeException extends RuntimeException
{
	
	AgeException(String msg)
	{
		super(msg);//becuse this msg can available for default handler(parent class)
	}
}


public class ThrowExample
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Age ");
			int iAge=sc.nextInt();
			
			//create userdefined exception but not handle
			/*if(iAge<18)
			{
				throw new AgeException("You are Not Eligible for vote");
			}
			
			else
			{
				
				System.out.println("You are eligible for vote");
			}
			}
			
	
			System.out.println("Exception will successfully Handled");
			*/
			//here handle exception
			
			
			try
			{
			if(iAge<18)
			{
				throw new AgeException("You are Not Eligible for vote");
			}
			
			else
			{
				
				System.out.println("You are eligible for vote");
			}
			}
			
			catch(java.lang.Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println("Exception will successfully Handled");
			
		}
}
	 