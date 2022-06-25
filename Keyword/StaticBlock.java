	class StaticBlock
{
	static//jdk 1.6 or earlier it will be execute without main function
	{
		System.out.println("static block 1");
	}
	
	public static void main(String args[])
	{
		System.out.println("i m in main method");
	}

	static
	{
		System.out.println("static block 2");
		
	}	
	static
	{
		System.out.println("static block 3");
		
	}
	
}	