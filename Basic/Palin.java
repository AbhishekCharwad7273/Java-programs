
import java.util.*;

public class Palin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int iNo=sc.nextInt();
		int iRem=0,iRev=0;
		int temp=iNo;
		while(temp>0)
		{
			iRem=temp%10;
			iRev=iRev*10+iRem;
			temp=temp/10;
		}
		
		if(iRev==iNo)
		{
			
			System.out.println(iNo+ ":No is Palindrome");
			
		}
		
		else
		{
			System.out.println(iNo+ ":No is Not Palindrome");
		}
	}
	
}
