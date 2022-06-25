import java.util.Scanner;

public class Patterntringle
{
		public static void pattern(int iNo)
		{
		
			for (int i=1;i<=iNo;i++)
				{
					for(int j=1;j<=i;j++)
						{
							System.out.print("*");
						}
							System.out.println();
				}
				
				for (int i=iNo;i>=1;i--)
				{
					for(int j=1;j<=i;j++)
						{
							System.out.print("*");
						}
							System.out.println();
				}
		}		

	public static void main(String args[])

{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int iValue=sc.nextInt();
		
		pattern(iValue);
}
}		
				