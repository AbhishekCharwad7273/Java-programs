class test
{
	
	test(ThisDemo TD)
	{
		System.out.println("this constructor");
	}
}

class ThisDemo
{
	void M1(ThisDemo TD)//pass and argument as a current class instance from the method
	
	{
		test t=new test(this);//this keyword as a constructor pass argument
		System.out.println("I am Main Method");
	}
	
	void M2()
	{
	M1(this);//pass and argument as a method call
	}
	
	public static void main(String args[])
	
	{
	
	ThisDemo TD=new ThisDemo();
	TD.M2();
	}
}	