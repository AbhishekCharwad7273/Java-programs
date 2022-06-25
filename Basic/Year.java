import java.util.Scanner;

public class Year
{
	public static void main(String args[])
	{
		System.out.println("Enter the Year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
    
		if(year % 400 ==0)
		{
			System.out.println("this is a leap year "+ year);
		}
		else if(year % 100==0)
		{
        System.out.println("this is not a leap year "+ year);
		}
    
		else if(year % 4 == 0)
		{
        System.out.println(" this is a leap year "+ year);
		}

		else
		{
        System.out.println("is not a leap year  " + year);
		}   
    }
}