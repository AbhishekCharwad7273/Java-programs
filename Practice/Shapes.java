
import java.util.*;
class Rectangle
{
int l=10,b=10;
	void Accept()
	{
		//int l=10;
		//int b=20;
	
	}
}

public class Shapes extends Rectangle
{
	void Display()
	{
		System.out.println(l+b);
	}
	
	public static void main(String args[])
	{
		Shapes obj=new Shapes();
		obj.Accept();
		obj.Display();
	}
}
		