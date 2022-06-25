public class CompileTypePolymorphism
{
	
	void rectangle()
	
	{
		System.out.println("the shape is rectangular");
	}

	void rectangle(int a,double b)
	{
		System.out.format("length is=%d and breadth is =%f \n",a,b);
		
	}
		
	void rectangle(double a,int b)
	{
		System.out.format("length is =%f and breadth of rectangle is=%d ",a,b);
	}
		
	public static void main(String args[])
	
	{

		CompileTypePolymorphism CT=new CompileTypePolymorphism();
		CT.rectangle();
		CT.rectangle(10,2.5);
		CT.rectangle(5.6,25);
	}
}	