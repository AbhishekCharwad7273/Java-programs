


class emp
{
	int eid;
	int salary;
	static String ceo;
	static // when you load a class
	{
	
			ceo="ASD";//we can called static variable using static block
	
		System.out.println("in Static");
	
	}	
	
	
	public emp()
	{
		eid=1;
		salary=5000;
		System.out.println("in constructor");
	}	
		
	public void display()
	{
		System.out.println(eid + " : " + salary +"  : " + ceo);
	}
}	



public class Static
{
	
	static int i;
	public static void main(String args[])
	{
		/*
		emp Abhi=new emp();
		Abhi.eid=27;
		Abhi.salary=2000;
		//emp.ceo="Suraj";//we can also used class name 
		
		emp Ankita=new emp();
		Ankita.eid=14;
		Ankita.salary=3000;
		//emp.ceo="Anmol";
		
		Abhi.display();
		Ankita.display();
		*/
		i=10;
		System.out.println(i);
		emp obj=new emp();
		emp obj1=new emp();
		
		obj.display();
		
		
	}

}	
