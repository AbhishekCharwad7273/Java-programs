

public class Stringbuffer
{
	public static void main(String args[])
	{
			// StringBuffer sb=new StringBuffer();
			//StringBuffer sb=new StringBuffer(1000);
		StringBuffer sb=new StringBuffer("Abhishek");
		System.out.println("capacity of string= "+sb.capacity());//how many charcter are stored  in the  string 16+string length
		sb.append("Hello");
		System.out.println("after apend string capacity ="+sb.capacity());
		
		sb.append("Mr Abhishek Charwad");
		System.out.println(sb.capacity());//capacity is 16*2+2 when 16 is full 
		
		StringBuffer sb1=new StringBuffer("Abhishek");
		System.out.println("length of string="+sb1.length());
		System.out.println(sb1.append("Java"));//it will concatinate string at last
		System.out.println("charcter at 2 position="+sb1.charAt(2));
		System.out.println("delete charcter 2to4="+sb1.delete(2,4));
		System.out.println("delete charcter at 5th position ="+sb1.deleteCharAt(5));
		StringBuffer sb2=sb.append("Java");
		System.out.println("String equals or not ="+sb.equals(sb2));
		System.out.println("index of charcter b is ="+sb1.indexOf("b "));
		System.out.println("last index of h ="+sb1.lastIndexOf("h"));
		System.out.println("insert position 3 as s ="+sb1.insert(3,"S"));
		System.out.println("replace string="+sb1.replace(2,6,"hi"));	
		System.out.println("string reverse="+sb1.reverse());//only in string buffer not in string
		System.out.println("sub sequence="+sb.subSequence(2,6));
		System.out.println("sub string="+sb1.substring(2));
		System.out.println("convert string into string buffer ="+sb.toString());	//it will convert String into the String Buffer 
	}
} 