//4>write a program to print Prime number=prime number means it divisible by 1 and that number only


import java.io.*;
import java.util.Scanner;

class Prime
 {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number:=");
		int iNo=sc.nextInt();
		int iDiv=0,flag=0;     
		iDiv=iNo/2;    
		if(iNo==0)
		{
			System.out.println(iNo+" is not prime number");    
		}
		else
		{
			for(int i=2;i<=iDiv;i++)
			{    
				if(iNo%i==0)
				{    
						System.out.println(iNo+" is not prime number");    
						flag=1;    
						break;    
				}    
			}    
   
		if(flag==0) 
			{ 
				System.out.println(iNo+" is prime number"); 
			}
		}
	}  
} 

	