import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class CollectionDemo
{
	public static void main(String args[])
	{
		/*
//-----This All about Collection-------------------//
	Collection values=new ArrayList();// we cannot added index in collection
	values.add(27);
	values.add(07);
	values.add(1995);
		System.out.println(values);	

	Iterator it=values.iterator();//It will be print number nextline
	//System.out.println(it.next());
	//System.out.println(it.next());	
	//System.out.println(it.next());
	while (it.hasNext())
	{
		
		System.out.println(it.next());
		
	}

*/

//--------This is List---------------------------------//


		List values=new ArrayList();
		values.add(60);//Integer V=new Integer(60)
		values.add(71);
		//values.add(2,55);
		 values.add(25);
		 values.add("Abhi");
		System.out.println(values);
		
		//for(int i=0;i<=values.size();i++)
		//{
			//System.out.println(values.get(i)) ;
		//}

			for(Object o:values)
			{
				System.out.println(o);
				
			}	
	}
}	