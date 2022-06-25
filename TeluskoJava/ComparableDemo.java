import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class stud implements Comparable<stud>
{
	int rollno;
	String name;
	int marks;
	public stud (int rollno,String name,int marks)
	{
		super();
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}

		public  String toString()
		{
			return "stud [rollno="+rollno +",marks="+marks +",name="+name +"]";
		}

		public int compareTo(stud s)
		{

				//return name.length()>s.name.length()?1:-1;
				//return marks>s.marks?1:-1;
				return rollno>s.rollno?1:-1;
				
	
		}
		
}		


public class ComparableDemo
{
	public static void main(String args[])
	{
		List <stud> studs=new ArrayList<>();
		studs.add(new stud(01,"ABHi",55));
		studs.add(new stud(07,"Ganesh",65));
		studs.add(new stud(02,"Shailesh",45));
		studs.add(new stud(10,"Aisha",70));
		
		Collections.sort(studs);
		
		for (stud s :studs)
			
			{
				System.out.println(s);
				
			}
		
	}

}	