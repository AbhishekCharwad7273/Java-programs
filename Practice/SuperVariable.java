

class A
{
	int a=10;
}

class SuperVariable extends A
{
		void display()
		{
		
			System.out.println(super.a);
	
		}
	
	
	public static void main(String args[])
	{
		SuperVariable Sv=new SuperVariable();
		Sv.display();
	}	
}	
