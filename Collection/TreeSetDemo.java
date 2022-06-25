
import java.util.*;
public class TreeSetDemo//duplicate values are not allowed
{
	public static void main(String args[])
	{
		Set<Integer> S=new TreeSet<>();//order display in sorted form
		S.add(10);
		S.add(20);//every integer have its unique hash
		S.add(07);
		S.add(140);
		S.add(180);
		//S.add(10);//it will cannot add 10 again
		//S.remove(10);
		System.out.println(S);
		System.out.println(S.contains(150));
		System.out.println(S.isEmpty());
		System.out.println(S.size());
		TreeSet<Integer> res = (TreeSet<Integer>)S.descendingSet();
		System.out.println("TreeSet after sorting in descending order\n" + res);

	
		
	}
	
}	
	