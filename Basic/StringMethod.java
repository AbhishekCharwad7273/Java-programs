
public class StringMethod
{
	public static void main(String args[])
	{
		
		
		//1>String length()
		String str="ABHi";	
		int i=str.length();
		System.out.println("Length of String is :-"+i);
		if(i==0)
		{
			System.out.println("String is Empty");
		}
		
		else
		{
			System.out.println("its Valid Name");
		}
		
 
		
		
		//2>is Empty()
		String str1="";
		System.out.println(str1.isEmpty());

		boolean b=str1.isEmpty();
		if(b)
		{
			System.out.println("String is Empty");
		}
		
		else
		{
			System.out.println("its Valid name");
		}
		
		
		//3>String Trim
		
		String str2="  Abhi   Charwad";
		System.out.println(str2);
		System.out.println(str2.trim());//middle spaces cannot removed by trim method
		
		//if(str2.trim().length()==0)
		if(str2.trim().isEmpty())	
		{
			System.out.println("String is Empty");
		}
		
		else
		{
			System.out.println("its Valid name");
		}
		

	//4>String Equals() and equalsIgnoreCase
	
	String s1="Abhi";
	String s2="abhi";
	System.out.println(s1.equals(s2));//it will also checked upper and lower case if difference then it will return false
	System.out.println(s1.equalsIgnoreCase(s2));//it will ignore upper and lower case
	System.out.println(s1.equals(""));//it wil checked String is empty or not


	//5>compareTo() and compareToIgnoreCase()
	
	String s3="a";//decimal value=65
	String s4="z";//decimal value=97
	System.out.println(s3.compareTo(s4));//result will be 32
	System.out.println(s3.compareToIgnoreCase(s4));//it will ignore upper case and lower case 
	//output:-s3=s4 then 0 
			//s3>s4 then positive
			//s3<s4 then negetive	
	
	//String Concant()
	
		String s5="Abhi";
		String s6="Charwad";
		
		System.out.println(s5+s6);//AbhiCharwad
		System.out.println(s5+10);//Abhi10
		System.out.println(s5+10+20);//Abhi1020
		System.out.println(10+20+s5);//30Abhi
		System.out.println(10+s5+30);//10Abhi30
		System.out.println(s5+20/10);//Abhi2
		//System.out.println(s1+10-5);//because of bodmas it will show error
	
		
		//String join()
			System.out.println(String.join(",",s5,s6));//Abhi,Charwad
			
		
		//String Subsequence()
		String st="This Is String Program";
		System.out.println(st.subSequence(2,6));//is  I
		
		
		
		//String Substring()
		String STR="I JAVA PROGRAMMING";
		System.out.println(STR.substring(2));//JAVA PROGRAMMING
		System.out.println(STR.substring(3,8));//AVA P
		
		
		//String Replace()
		String Rst="This is Demo";
		System.out.println(Rst.replace("is","Was"));//Thewas was demo	
		System.out.println(Rst.replaceFirst("is","Was"));//theWas is demo
		System.out.println(Rst.replaceAll("is","Was"));//Thiswas was demo
		System.out.println(Rst.replaceAll("is(.)","Was"));//it will removed space thiswaswasdemo
		System.out.println(Rst.replaceAll("is(.*)","Was"));//after is all string are removed thwas
		
	}
}