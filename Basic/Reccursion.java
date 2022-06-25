import java.util.Scanner;

public class Reccursion
{
		public static int recur(int x)
		{
		

    
					if (x==1 || x==0)
						{
							return 1;
						}
    
					else
						{
							return x * recur(x-1);
						}
		} 
				

	public static void main(String args[])

{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int iValue=sc.nextInt();
		System.out.format("the factorial of number %d is %d",iValue,recur(iValue));
		
		recur(iValue);
}
}		
				