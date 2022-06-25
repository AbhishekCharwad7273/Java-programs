class Finally

{

	public static void main(String args[])
	{
		
		try
			{
				int a=10;
				int b=0;
				int c=a/b;
				System.out.println(c);
			}
		catch(java.lang.Exception e)
			{
				System.out.println(e);
				//e.printStackTrace();
			}
		finally
			{
				int a=52+1;
				System.out.println(a);
			}
	}
}	
		