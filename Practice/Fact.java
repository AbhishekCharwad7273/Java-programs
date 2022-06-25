
import java.util.*;
public class Fact
{
	public static void main(String[] args)
	{

		int i=1 ;
		int Fact=1;	
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int iNo = Sc.nextInt();
		/*for(i=1;i<=iNo;i++)
		{
			Fact=Fact*i;
			
		}*/
		
		while(i<=iNo)
		{
			Fact=Fact*i;
			i++;
		}	

			System.out.println("The Factorial of This Number is :"+Fact);		
			
	}
}