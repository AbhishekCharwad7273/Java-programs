import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GenericsDemo
{
	public static void main(String args[])
	{
		List<Integer> values=new ArrayList<Integer>();
		values.add(60);
		values.add(71);
		 values.add(25);
		 values.add(10);
		 //values.add("Abhi");only declare int value
		 //Collections.sort(values);
		 //Collections.reverse(values);
		Collections.shuffle(values);	
		System.out.println(values);
	
		
	}
}
	