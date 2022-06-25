import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
public class SetDemo
{
	public static void main(String args[])
	{
		
		//Set<Integer> values=new HashSet<>();
				Set<Integer> values=new TreeSet<>();//it will print Accending order
		values.add(652);
		values.add(125);
		values.add(412);		
		values.add(252);//duplicattion not allowed in Set
		
		for(int i:values)
			
			{
				System.out.println(i);
				
			}

	}

}
	