
public class StringSearching
{
	public static void main(String args[])
	{
		String s1="Abhi";
		String s2="Charwad";
		System.out.println(s1.indexOf('h'));//it will search first index//2
		System.out.println(s1.indexOf("Ab"));
		System.out.println(s2.lastIndexOf('a'));//it will search into last index//5
		System.out.println(s1.charAt(3));//i
		System.out.println(s1.contains("i"));//true
		System.out.println(s2.startsWith("C"));//true
		System.out.println(s1.endsWith("h"));//false
	}
}