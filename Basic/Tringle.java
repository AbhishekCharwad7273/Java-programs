
import java.util.*;

public class Tringle
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int iNo;
		System.out.println("Enter the number");
		iNo=sc.nextInt();
		
		for(int j=iNo;j>=1;j--)
		{
			for(int i=j;i>=1;i--)
			{
				System.out.print(" "+j+"");
				
			}
			System.out.println();
			
		}
	}
}
		