abstract class Monkey
{
	abstract void jump();
		
	abstract void bite();
	
	void Dance()
	{
		System.out.println("Monkey Are Dancing");
	}
	
}
		

class Human extends Monkey 
{
					
	void jump()
			{
				System.out.println("jump into the tree");
			}
	void  bite()
			{
				System.out.println("Monkey bite an human");
			}		
		
	public static void main(String args[])
	{
		Human H=new Human();
		H.jump();
		H.bite();
		H.Dance();
	}
}	
	