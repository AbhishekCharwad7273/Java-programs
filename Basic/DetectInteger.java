import java.util.*;

public class DetectInteger
{

	public static void main(String args[])
	{
		int iNo;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		iNo=sc.nextInt();
		
		try
		{
			if(iNo==(int)iNo)
			{	
				System.out.println("No is Integer");
			}

			else
			{

					System.out.println("No is Not Integer");
				
			}
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}
		
	}
}	