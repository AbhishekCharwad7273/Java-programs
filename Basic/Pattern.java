import java.util.Scanner;

public class Pattern
{

	public static void main(String args[])
	{
	System.out.println("enter the no ");
	Scanner sc=new Scanner(System.in);
	int iNo= sc.nextInt();
	int i,j;
	
	for(i=1;i<iNo;i++)
	{
		for(j=5;j>i;j--)
		
		{
			System.out.print("*");
			
		}	
		System.out.println();
	}
	
	}
}	