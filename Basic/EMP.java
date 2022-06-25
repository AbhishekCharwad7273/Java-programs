


class Employee
{
	int eId;
	String name;
	
	void get()
	{
	System.out.println("the id is"+ eId);
	System.out.println("and the name  is"+ name);
	}
}


	public class EMP
	{
		public static void main(String args[])
		{
			
			Employee eobj=new Employee();
			
			eobj.eId=12;
			eobj.name="Abhi";
			eobj.get();
		}
	}		