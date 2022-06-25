

class Test

{
	
	public void show()
	{
		System.out.println("Shoe Sem Result");
		
	}

}	





public class AnonymousDemo
{
	
	public static void main(String args[])
	
	{
			Test obj=new Test()//----->this is a Anonymous class we cannot used in anywhere
			
			                 {
								public void show()
								{
									System.out.println("Shoe Yearly  Result");
		
								}
							 };	
		obj.show();
	}

}	