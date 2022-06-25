

public class AirthmaticExpression
{
	public static void main(String args[])
	{
		int V=3,U=4,a=5,s=6;
		int result=0;
		result=((V*V)-(U*U)/2*a*s);
		System.out.println("final Result of this Expression is : "+result);
		
		String str="ABHI    ";
		String lw=str.toLowerCase();
		System.out.println("Lower Case : "+lw);
		
		int L=str.length();
		System.out.println("Length of String is : "+L);
		
		String uc=str.toUpperCase();
		System.out.println("Lower Case : "+uc);
		
		String T=str.trim();
		System.out.println("Trim string : "+T);
		
		String S=str.substring(2);
		System.out.println("Substring is : "+S);
		
		String SS=str.substring(0,2);
		System.out.println("Substring is : "+SS);
		
		String R=str.replace('A','C');
		System.out.println("Replace Charcter: "+R);
		
		
		
	}
}