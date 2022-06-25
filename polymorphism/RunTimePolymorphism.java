class RunTimePoly
{
	//void show(int a)
	//Object show()//case1-java 5.0 it will allow to object->string relationship 
	//void show()//case-2 access specifier of derived class is bigger then base class
	//void show()throw excepton//case 3-overRiden method doesnot check the throw excepton  
	//case 5-final,static,private method should not overRiden
	void show()
	{
		System.out.println("hello");
		//return null;
	}
	 //void show()
	//{
		//System.out.println("hello jii");
	//}	
}

class RunTimePolymorphism extends RunTimePoly
{
 void  show()throws ArithmeticException //uncheck exception can work
	{		
		super.show();//case4-it will used to called base class overRiden methode
		System.out.println("HelloWorld");
		//return null;
	}
	
	public static void main(String args[])
	{
		RunTimePolymorphism R=new RunTimePolymorphism();
		R.show();
		RunTimePoly R1=new RunTimePoly();
		R1.show();
		//RunTimePoly R1=new RunTimePoly();
		//R1.show();
	}
}	