public class StringConversion
{
	public static void main(String args[])
	{
		String str="Abhishek";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		int a=10,b=12;
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		System.out.println(a+b);
		System.out.println(s1+s2);//integer will converted into string
		char[] c=str.toCharArray();
		System.out.println(c);//it will print char array
	}
}
