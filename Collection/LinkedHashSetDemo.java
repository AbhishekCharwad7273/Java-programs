
import java.util.*;
public class LinkedHashSetDemo//duplicate values are not allowed
{
	public static void main(String args[])
	{
		Set<Integer> S=new LinkedHashSet<>();// list display  orderwise
		S.add(10);
		S.add(05);
		S.add(20);//every integer have its unique hash
		S.add(50);
		S.add(140);
		S.add(180);
		
		S.add(10);//it will cannot add 10 again
		//S.remove(10);
		System.out.println(S);
		System.out.println(S.contains(150));
		//System.out.println(S.isEmpty());
		System.out.println(S.size());
			System.out.println(S.hashCode());//it will return hashcode Value of this Collection
		


	
		
	}
	
}	
	