


import java.util.*;

public class PalindromeInteger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int iNo=sc.nextInt();
		int iRev=0;
		int Srev;
		
		for(int i=Str.length()-1;i>=0;i--)
		{
			Srev=Srev+Str.charAt(i);
		}
		
		
		if(Str.equals(Srev))
			{
			System.out.println("Given String is Palindrome String");
		}
		
		else
		{
			System.out.println("Given String is Not Palindrome String");
		}
	}
}
