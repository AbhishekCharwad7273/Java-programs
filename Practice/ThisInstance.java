//this keyword can be used current class instance


public class ThisInstance
{
	ThisInstance Accept()
	{
		return this;
	}
	
	public static void main(String args[])
	{
		ThisInstance Ti=new ThisInstance();
		Ti.Accept();
	}
}
