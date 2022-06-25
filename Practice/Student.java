


class School
{
	String str="CYDP";
	public void Show()
	{
		System.out.println("dept in school");
	}
	
	School()
	{
		System.out.println("School has a big PlayGround");
	}
	
}

public class Student extends School
{
	public void display()
	{
		System.out.println(super.str);
	
		super.Show();
	}
	
	Student()
	{
		super();
	}
	
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.display();
	}
}

	
	
	