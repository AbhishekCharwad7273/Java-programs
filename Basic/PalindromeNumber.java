
import java.util.*;


public class PalindromeNumber
{

	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int iNO=sc.nextInt();
		int temp=iNO;
		int irev=0,iRem=0;
		
		while(temp!=0)
		{
			iRem=temp%10;//------->it will Give Remiander
			irev=irev*10+iRem;
			temp=temp/10;//------->it will Give Qutient
		}

		if(iNO==irev)
		{

			System.out.println(iNO+ " is Palindrome Number ");
		}

		else
		{
			System.out.println(iNO+ " is Not Palindrome Number ");

		}
	}
}	