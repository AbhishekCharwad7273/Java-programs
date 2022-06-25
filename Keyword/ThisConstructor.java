class ThisConstructor

{
	final int b;
	ThisConstructor()//this keyword used as constructor
	{
		this(20);//here default constructor called parameterized constructor
		System.out.println("default Constructor Called");
	}

	 ThisConstructor(int a)
		
	{
		b=10;
		System.out.println(b);
		//this();//here parameterized constructor called default constructor using this keyword
		System.out.println("Parameterized Constructor Called");
	}


	
		public static void main(String args[])
		
		{
			
			ThisConstructor TC=new ThisConstructor(12);
				
		}
}		