//10>write a program factorial of given number

import java.util.*;
class Fact
 {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int iNo=sc.nextInt();
		int fact=1;
		for(int i=1;i<=iNo;i++)
		{
		 fact=fact*i;
		}
		
		System.out.println("Factorial Of Given number is: "+fact);
	}
 }
 