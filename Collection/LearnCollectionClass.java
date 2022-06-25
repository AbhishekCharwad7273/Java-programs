import java.util.*;
public class LearnCollectionClass
{
	public static void main(String args[])
	{
		
		ArrayList<Integer> emp_id=new ArrayList<>();
		emp_id.add(10);
		emp_id.add(40);
		emp_id.add(30);
		emp_id.add(15);
		emp_id.add(50);
		emp_id.add(60);
		emp_id.add(40);
		emp_id.remove(3);
		
		System.out.println(Collections.min(emp_id));
		System.out.println(Collections.max(emp_id));
		System.out.println(Collections.frequency(emp_id,40));
	
		Collections.sort(emp_id);
		System.out.println(emp_id);//asending order
		
		Collections.sort(emp_id,Comparator.reverseOrder());
		System.out.println(emp_id);//desending order
		
		
	
	}
}
		