

public class StaticVariable
{
	int id;
	String name;
	static String c_name="Sinhgad";
	
	void Accept(int e_id,String e_name)
	{
		id=e_id;
		name=e_name;
	}
	void display()
	{
		System.out.println("emp id is:="+id);
		System.out.println("Emp name is :="+name);
		System.out.println("Emp Company name is:="+c_name);
		System.out.println("\t");
	}
	
	public static void main(String args[])
	{
		StaticVariable Sv=new StaticVariable();
		Sv.Accept(10,"Abhi");
		Sv.display();
		
		
		StaticVariable Sv1=new StaticVariable();
		Sv1.Accept(11,"Ab");
		Sv1.display();
		
		StaticVariable Sv2=new StaticVariable();
		Sv2.Accept(11,"Abishek");
		Sv2.display();
	}
}
		