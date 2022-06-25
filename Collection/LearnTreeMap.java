
import java.util.*;
public class LearnTreeMap
{
	public static void main(String args[])
	{
		Map<Integer,String> Name=new TreeMap<>(Collections.reverseOrder());//tree map will be sorted as keypair basis
		Name.put(1,"Abhi");
		Name.put(2,"Anil");
		Name.put(3,"Singdha");
		Name.put(8,"Pratiksha");
		Name.put(4,"Shivam");
		
		Name.putIfAbsent(5,"Vaibhav");	
		

		
		System.out.println(Name);
		
		for(Integer key:Name.keySet())
		{
				System.out.println(key);
		}
			
		for(String value:Name.values())
		{
				System.out.println(value);
		}
			
			
		System.out.println(Name.containsKey(8));
		System.out.println(Name.containsValue("Singdha"));
		
		
	}
}