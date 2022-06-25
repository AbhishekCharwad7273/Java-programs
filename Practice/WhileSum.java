
import java.util.*;
public class WhileSum
{
	public static void main(String[] args)
	{

		int i;		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n = Sc.nextInt();
		System.out.println("Numbers are : ");
		int Sum=0;
		/*while(i<=n)
		{	
			Sum=Sum+i;
			i++;
		}*/
		
		for(i=1;i<=n;i++)
		{
			Sum=Sum+i;
		}
		System.out.println("THe Sum Natural Number is "+Sum);
	}
}