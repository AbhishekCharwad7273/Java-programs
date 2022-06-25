
import java.util.*;

public class Pascal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int iNo=sc.nextInt();

		int c=0;

		for(int i=1;i<iNo;i++)
		{
			for(int j=1;j<=i;j++)
			{/*
				if(c!=iNo)
				{
					c++;
					System.out.print(" "+c);
				}
				*/
				
					System.out.print((i*j)+ " ");
			}
			System.out.println();
		}
		
	}
}
		