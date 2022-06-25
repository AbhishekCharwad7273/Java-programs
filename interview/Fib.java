//5>fibonacci series
import java.util.*;

public class Fib
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count");
		int iCnt=sc.nextInt();
		int a=0,b=1,c=1;
		
		for (int i=1;i<iCnt;i++)
		{
			System.out.print(a+" ");
			
			a=b;
			b=c;
			c=a+b;
		}
		
	}
}

		
		