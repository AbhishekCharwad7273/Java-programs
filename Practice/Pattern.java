
import java.util.*;
public class Pattern
{
	public static void main(String[] args)
	{

		int i;		

		for(i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
						
		
	}
}