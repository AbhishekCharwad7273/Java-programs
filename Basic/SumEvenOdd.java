
import java.util.*;

public class SumEvenOdd
{
	public static void main(String args[])
	{
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int iNo=sc.nextInt();
		int SumEven=0;
		int countEven=0;
		int countOdd=0;
		int SumOdd=0;
		int EvenAvg;
		int OddAvg;
		while(iNo>0)
		{
			
			if(iNo%2==0)
			{
				countEven++;
				SumEven=SumEven+iNo;
			}
			
			else
			{
				countOdd++;
				SumOdd=SumOdd+iNo;
			}
			iNo--;
			
		}
		
		EvenAvg=SumEven/countEven;
		OddAvg=SumOdd/countOdd;
		
		//System.out.println("Sum of Even is :"+SumEven);
		//System.out.println("Sum of odd is :"+SumOdd);
		
		System.out.println("Avg of Even is :"+EvenAvg);
		System.out.println("Avg of Odd is :"+OddAvg);
	}
}
