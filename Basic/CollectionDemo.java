

import java.util.ArrayList;
import java.util.Collection; 

public class CollectionDemo
{
	public static void main(String args[])
	{
		ArrayList obj1=new ArrayList();
		obj1.add(10);//10 is not an integer is treated as a Object
		obj1.add("Abhi");
		
		System.out.println(obj1.add("1223"));
		System.out.println(obj1);

	
		ArrayList obj2=new ArrayList();
		obj2.add(20);//10 is not an integer is treated as a Object
		obj2.add("Charwad");
		System.out.println(obj2);
		
		obj1.addAll(obj2);
		
		System.out.println(obj1);
		
		System.out.println(obj1.contains(10)); 
			System.out.println(obj1.contains(100));
	System.out.println(obj1.isEmpty()); 
	System.out.println(obj1.size());
	//obj1.remove(0) ;//0 will be index of obj1.10 then 10 will be remove
	obj1.remove("Abhi"); 
	System.out.println(obj1);
	obj1.removeAll(obj2);
		System.out.println(obj1);
	
		
	}
}
