
public class StringMax
{
	public static void main(String args[])
	{
		String Str="this is java program";
		Str=Str.replaceAll("\\s","");
		System.out.println(Str);
		int arr[]=new int[127];
		int max=-1;
		char c=' ';
		for(int i=0;i<Str.length();i++)
		 {
			arr[Str.charAt(i)]=arr[Str.charAt(i)]+1;
		}
		
		for(int i=0;i<Str.length();i++)
		{
			if(max<arr[Str.charAt(i)])
			{
				
				max=arr[Str.charAt(i)];
				c=Str.charAt(i);
			}
		}
		System.out.println("Maximum Repeted character is :="+c);
	}
}
		
		