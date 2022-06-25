import java.util.*;

public class ArrayListDemo 
{
	public static void main(String args[])
	{
		ArrayList<Integer> str=new ArrayList<>();
		str.add(12);
		str.add(6);
		str.add(5);
		str.add(34);
		str.add(322);
		str.add(0);
		str.add(0);
		Collections.sort(str);
		System.out.println(str);
		Collections.sort(str,Comparator.reverseOrder());
		System.out.println(str);
			
		
		System.out.println(Collections.frequency(str,5));
		System.out.println(Collections.min(str));
		System.out.println(Collections.max(str));
		System.out.println(str.contains(34));
		System.out.println(str.isEmpty());
		System.out.println(str.size());
		
		
		List<String> str1=new ArrayList<>();
		
		str1.add("sdsdsd");
		str1.add("asddd");
		str1.add("kdjfkd");
		str1.add("dsdsdsds");
		str1.add("qwerd");
		str1.add("qwerty");
		str1.add("asdf");
		System.out.println(str1);
		Collections.sort(str1);
		System.out.println(str1);
		Collections.sort(str1,Comparator.reverseOrder());
		System.out.println(str1);
	
		PriorityQueue<Integer> p1=new PriorityQueue<>(Comparator.reverseOrder());
		p1.offer(7788);
		p1.offer(452);
        p1.offer(147);	
		p1.offer(98721);	
		System.out.println(p1);
		System.out.println(Collections.min(p1));
		System.out.println(Collections.max(p1));
		System.out.println(Collections.frequency(p1,147));
		System.out.println(p1.isEmpty());
		System.out.println(p1.contains(147));
		System.out.println(p1.poll());
		System.out.println(p1.peek());
		
		ArrayDeque<Integer> arr=new ArrayDeque<>();
		arr.offer(545);
		arr.offerFirst(74565);
		arr.offerLast(78);
		arr.offer(74);
		arr.offer(956);
		System.out.println(arr);
	}
}
