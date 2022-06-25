
class casio
{
	
	//Method overloading
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	public void add(double x,double y)
	{
		System.out.println(x+y);
	}
	
	//-------------------------------------
	//constructor overloading
	
	casio(int x,int y)
	{
		System.out.println(x+y);
	}	
	
	
	casio(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}	
	
	
	
}	

class MethodOverloading
{
	public static void main(String args[])
	{
			//casio obj=new casio(12,52);
			
			casio obj=new casio(12,52,51);
			//obj.add(65,52);
			//obj.add(5,10,65);
			//obj.add(12.5,12.5);
	}

}	