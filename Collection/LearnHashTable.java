import java.util.*;


public class LearnHashTable
{
	public static void main(String args[])
	{
		Hashtable<Integer,String> hs=new Hashtable<>();
		hs.put(10,"Abhi");
		hs.put(3,"Ab");
		hs.put(8,"Abi");
		hs.put(6,"bhi");
		hs.put(18,"Ai");
		hs.put(12,"Abhishek");
		hs.put(6,"Abhishek");
		System.out.println(hs);
		
		//for(Map.Entry<Integer,String> i:hs.entrySet())
		//System.out.println(i.getKey()+" "+i.getValue());
		
		/*
		for(Integer key:hs.keySet())
		{
			System.out.println(key);
		
		for(String value:hs.values())
		{
			System.out.println(value);
		}
		
		
		
		}*/
	}
}




