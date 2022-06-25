

class A

{
	A()
	{
		System.out.println("This is a default constructor");
		
	}	
	void M1()
	{
		System.out.println("this is A class M1 Method");
	}
	
	int a=27;
}

class SuperKeyword extends A

{
		SuperKeyword()
		{
			super();//it is called as a parent class constructor
			System.out.println("this is constructor B");
		}	
		int a=07;
			
		void M1()
		{
		System.out.println("this is M1 class in B");
		}
		
		void  display(int a)
		{
		System.out.println(super.a);//super keyword used same variable of base class in derived class	
		System.out.println(this.a);
		System.out.println(a);
		super.M1();
		M1();
		}
		
		public static void main(String argd[])
		{
			SuperKeyword SK=new SuperKeyword();
			SK.display(94);
			
		}
}		
		