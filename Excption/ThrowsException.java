import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


class ReadWrite
{
	
	void read()throws FileNotFoundException
	{
		FileInputStream FI=new FileInputStream("D:/abc.txt");
	}
	
	void write()throws FileNotFoundException	
	{
		String str="hi throws exceptiom";
		FileOutputStream Fo=new FileOutputStream("E:/s.txt");
	}		
}	

class ThrowsException

{
	
	public static void main(String args[])throws FileNotFoundException
	{
		
			ReadWrite RW=new ReadWrite();
			try
			{
			RW.read();
			RW.write();
			}
			catch(java.lang.Exception e)
			{
				e.printStackTrace();
			}
			
				System.out.print("hello");
	}
}	