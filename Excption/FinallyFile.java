import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


 class FinallyFile
{
	public static void main(String args[])throws IOException
	
	{
		FileInputStream FIS=null;
		
		try
		
		{
			FIS=new FileInputStream("d:/a.txt");
		}
			
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}
	
		finally
		{
			if (FIS!=null)
			{
				FIS.close();
			}	
			System.out.println("File Closed");
		}
	}
}	
			