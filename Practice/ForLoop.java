
import java.util.*;
public class ForLoop
{
	public static void main(String[] args)
	{

		int i;		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n = Sc.nextInt();
		System.out.println("Numbers are : ");

		for(i=1;i<=n;i++)
		{
			System.out.println("Numbers are : "+i);
		
		}
		for(i=n;i>=1;i--)
		{
			System.out.println("Numbers are : "+i);
		}
		
	}
}