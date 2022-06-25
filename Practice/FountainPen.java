
abstract class Pen
{
	abstract void write();
	{
		int a=10;
		 System.out.println(a);
	}
	
	abstract void refill();
}
	




public class FountainPen extends Pen
 {
	 void write()
	 {
		 System.out.println("Write a Letter with Pen");
		 		
	 }
	 void refill()
	 {
		 System.out.println("change The Refill with another pen");
	 }		 
	 
	public static void main(String args[])
	{
		FountainPen obj=new FountainPen();
		obj.write();
		obj.refill();
		
	}

}	