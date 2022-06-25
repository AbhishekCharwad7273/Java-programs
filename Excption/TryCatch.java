import java.io.FileInputStream;
import java.lang.Exception;

class TryCatch
{


	public static void main(String args[])
	
	{
		
		//FileInputStream F=new FileInputStream("d:/a.txt");
		//Class.forName("com.mysql.jdbc.Driver");//compile time error(Check error)
		
		/*try
		{
		Class.forName("com.mysql.jdbc.Driver");//compile time error(Check error) it will check by compiler
		}
		catch (java.lang.Exception e)
		{
			System.out.println(e);
		}*/	
		System.out.println("1");
		try
		{
			System.out.println("2");
		int a=10;
		int b=0;
		//int b=5;
		int c=a/b;//this type of instruction compiler cannot check(runtime and uncheck exception)
		System.out.println("3");
		System.out.println(c);
		System.out.println("4");
		}
		
		catch(Exception e)
		{
			System.out.println("5");
			System.out.println(e.getMessage());
			//e.printStackTrace();
			//System.out.println(e);
			//System.out.println("you cannot divide number by zero");
		}
		System.out.println("END");
		
	
	
	}	
	
}	