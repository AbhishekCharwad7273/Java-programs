public class TringlePattern
{

public static void main(String args[])
{
	int iRow=5;
	
	for(int i=1;i<=iRow;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}	
		
		System.out.println();
	}	
	
	for(int i=iRow-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
			System.out.println();
	}
	
	
	
	
}
}	