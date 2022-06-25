//1>Write a program to reverse the string


public class StringReverse
{
	public static void main(String args[])
	{
		
		String str="Abhi";
		String nStr="";
		char ch;
		for (int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nStr=nStr+ch;
		}
		
		System.out.println("Reverse String is"+nStr);
	}
}