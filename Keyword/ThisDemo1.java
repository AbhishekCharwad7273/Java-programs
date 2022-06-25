javclass ThisDemo1
{
	ThisDemo1 M1()//can be used return the current class
	
	{
		return this;
	} 
	
	public static void main(String args[])
	
	{
	
	ThisDemo1 TD=new ThisDemo1();
	TD.M1();
	}
}	