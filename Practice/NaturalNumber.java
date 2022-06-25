import java.util.Scanner;


public class NaturalNumber
{
	public static void main(String args[])
	{	
		System.out.println("enter Number");
		Scanner sc=new Scanner(System.in);
		int iNo=sc.nextInt();
		
		while( int i>=100 && i<=200)
		{
				System.out.println("It is Natural Number"+i);
		}

			System.out.println("It is Not A Natural Number");
			
	}
}