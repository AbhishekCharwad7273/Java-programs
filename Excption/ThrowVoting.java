import java.util.Scanner;

class YoungerAgeException extends RuntimeException
{
YoungerAgeException(String msg)
	{
		super(msg);//becuse this msg can available for default handler(parent class)
	}
}

class ThrowVoting
	{

		public static void main(String args[])
		
		{
			Scanner S=new Scanner(System.in);
			System.out.println("Enter the number");
			int age=S.nextInt();
			try
			{
				if(age<18)
				{
					throw new YoungerAgeException("you are not eligible for voting");//it is a userdefined Exception
				}

				else
				{
					System.out.println("You Are Eligible For Vote");
				}
			}
			
			catch(YoungerAgeException e)
			{
				System.out.println(e);
			}	
			System.out.println("hello"); 
		}
	}		