//6>list contains odd number

import java.util.*;

public class ListOdd
{
	public static void main(String args[])
	{
		List<Integer>list_odd=new ArrayList<>();
		list_odd.add(14);
		list_odd.add(07);
		list_odd.add(9);
		list_odd.add(16);
		list_odd.add(17);
		list_odd.add(16);
		list_odd.add(13);
		
		System.out.println("List are :-"+list_odd);
		/*
		for(int i:list_odd)
		{
			if(i%2!=0)
			{
				System.out.println("odd number are present in a List are:-" +i);
			}
		}
		*/
		
		public static boolean onlyOddNumbers(List<Integer> list_odd)
		{
			for (int i : list)
			{
				if (i % 2 == 0)
				return false;
			}
		return true;
		}

	}
}

		
		