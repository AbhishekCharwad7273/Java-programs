
import java.util.*;

public class Fib
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int iNo=sc.nextInt();
		
	int f1,f2=0,f3=1;
		for(int i=1;i<=iNo;i++)
		{
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}
}
