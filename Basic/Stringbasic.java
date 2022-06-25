
import java.util.*;
public class Stringbasic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String name=sc.nextLine();
		System.out.println("You Entered "+name);
		//String name = "Abhi";
		//System.out.println(name);
		int iLength=name.length();
		System.out.println("The Length Of a String is =" +iLength);
		String lcase=name.toLowerCase();
		System.out.println("Lower Case String is = "+lcase);
		String ucase=name.toUpperCase();
		System.out.println("Upper Case String is = "+ucase);
		String nontrimString="      Charwad    ";
		System.out.println("Non-Strim-String is ="+nontrimString);
		System.out.println(nontrimString.trim());
		System.out.println("Sub String is = "+name.substring(2));
		System.out.println(name.substring(2,4));
		System.out.println("Replace Name= "+name.replace('A','B'));
		System.out.println("Name Starts With = "+name.startsWith("A"));
		System.out.println("names End With = "+name.endsWith("i"));
		System.out.println("String Location = "+name.charAt(2));
		System.out.println("String Index = "+name.indexOf("b"));
		System.out.println("String Index Of = "+name.indexOf("i",3));
		System.out.println("String Last indexOf = "+ name.lastIndexOf("h"));
		System.out.println("String Equals = "+name.equals("AXC"));
		System.out.println("String Equals Ignore CAse = " +name.equalsIgnoreCase("ABHI" ));
		String letter="dear <|name|>,Thanks a lot";
		letter=letter.replace("<|name|>","ABHISHEK");
		System.out.println(letter);
		String mystring="hello  word";
		System.out.println(mystring.indexOf("  "));
		System.out.println(mystring.indexOf("   "));
	}
}	