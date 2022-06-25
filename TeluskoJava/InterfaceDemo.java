//-->types of interface
//-->1>normal
//-->2>sigal abstract method -->functional interface-lambda expression-scala
//-->3>Marker interface

interface Abc
{
	
	public void show();//interface method has a no body only declaration
	
}
	
class A implements Abc
{

		public void show()
		{
			System.out.print("In interface");
		}	
}

public class InterfaceDemo
{	
	public static void main(String args[])
	{
		
		//Abc obj=new Abc();//we cannot create object of interface
		//Abc obj=new A();
		//obj.show();
		
		//Abc obj=new Abc()
		
		  //               {
			//				 public void show()
		      //               {
			    //                  System.out.print("We can create anonymous class interface");
		          //           }
					//		 
						// };
		Abc obj=()-> System.out.print("We can also declear interface show method implementation");//this is called lambda expression only possible functional interface
						
		obj.show();				 
	}

}	