// 1>java program to reverse a word

import java.io.*;
import java.util.Scanner;

class StringReverse
 {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.next();
		int len=str.length();
		System.out.println("Length of String is:="+len);
		
		String nstr="";
		char ch;
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	
	System.out.println("Reversed word: "+ nstr);
	}
 }
