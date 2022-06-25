class EmpStatic
{
	int empid;
	String name;
	static String company="ABV";
	//static int count=0;
	
	EmpStatic(int empid,String name)
	{
		
		this.empid=empid;
		this.name=name;
		//count++;
		//System.out.println(count);
	}
	
	
	void display()
	{
	System.out.println(" empid= "+empid+ " name= "+name+ " company= " +company);
	}

public static void main(String args[])
	{
		EmpStatic Em=new EmpStatic(101,"Abhi");
		Em.display();
		EmpStatic Em1=new EmpStatic(102,"suraj");
		Em1.display();
		EmpStatic Em2=new EmpStatic(103,"rahul");
		Em2.display();
	}
}	