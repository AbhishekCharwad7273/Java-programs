

import java.util.*;

public class StringPalin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String Str=sc.nextLine();
		
		String Srev="";
		
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
