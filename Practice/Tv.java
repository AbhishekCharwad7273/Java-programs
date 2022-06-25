
import java.io.*;
interface TvRemote
{
	void Display();
}

 interface SmartTvRemote extends TvRemote
{

	void SmartDisplay();
}

public class Tv implements SmartTvRemote
{
	
		public void Display()
		{
			System.out.println("Play a Zee Tv");
		}
		
		public void SmartDisplay()
		{
			
			System.out.println("Play a Netflix Web series");
		}
		
		public static void main(String args[])
		{
		
			Tv obj=new Tv();
			obj.Display();
			obj.SmartDisplay();
		}
}
		
		
	