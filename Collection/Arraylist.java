import java.util.ArrayList;
import java.util.*;

public class Arraylist
{
	public static void main(String args[])
	{
	/*	
		ArrayList<String> student_name=new ArrayList<>();
		student_name.add("Abhi");
		//size=n
		//then when array is full then
		//n+n\2+1 size will allocate dynamically
		student_name.add("gaurav");
		student_name.add("Shailaja");
		student_name.add("Amruta");
		System.out.println(student_name);
		
		//student_name.add("Amol");
		//System.out.println(student_name);//it will add element at last
		
		//student_name.add(1,"Amyy");
		//System.out.println(student_name);
		
		
		ArrayList<String> emp_name=new ArrayList<>();
		emp_name.add("Rahul");
		emp_name.add("PArag");
		emp_name.add("Maruti");
		emp_name.add("AVni");
		
		System.out.println(emp_name);
		student_name.addAll(emp_name);
		
		System.out.println(student_name);
		System.out.println(student_name.get(4));//index 4 element will display
			
		student_name.remove(3);//remove index 3 element

			student_name.clear();//clear all the list
			
			emp_name.set(1,"Shivam");
			System.out.println(emp_name);//it will change element
		System.out.println(emp_name.contains("Shivam"));
		
		*/
		ArrayList<Integer> emp_id=new ArrayList<>();
		emp_id.add(10);
		emp_id.add(20);
		emp_id.add(30);
		emp_id.add(40);
		emp_id.add(50);
		emp_id.add(60);
		System.out.println(emp_id);
		
		for(int i=0;i<emp_id.size();i++)
		{
			System.out.println("array element are:"+emp_id.get(i));//iterate the array element
		}
		Iterator<Integer> it=emp_id.iterator();
		while(it.hasNext())
		{
				System.out.println("iterator is:"+it.next());
		}
		
	}
}
 