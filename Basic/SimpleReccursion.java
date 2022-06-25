public class SimpleReccursion

{	
	void display(int n)
	{
		if(n<1)
		{
			
			return;
		}
		else
		{
			System.out.print(" "+n);
			display(n-1);
			System.out.print(  " "+n);
		}
	}	
		
	
	
	public static void main(String args[])
	
	{
		int n=3;
		SimpleReccursion SR=new SimpleReccursion();
		SR.display(n);
		
	}
}
	