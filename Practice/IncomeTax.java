import java.util.Scanner;

public class IncomeTax
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Income");
		float Income=sc.nextFloat();
		float Tax=0;
			
		if(Income<=250000)
		{
			System.out.println("No Tax Will Paid");
		}
		
		 if(Income>=250000 && Income<=500000)
		{
			Tax=0.05f *(Income-250000);
		}

		if(Income>=500000 && Income<=1000000)
		{
			Tax=0.20f *(Income-500000);
		}
		if(Income>=1000000 )
		{
			Tax=0.30f *(Income-1000000);
		}		
			
			System.out.println("Income Tax Will Paid By Customer = "+Tax);
	}
}	