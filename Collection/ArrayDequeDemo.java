

import java.util.*;

public class ArrayDequeDemo//it will add element both side 
{
	public static void main(String args[])
	{
		ArrayDeque<Integer> queue=new ArrayDeque<>();
		queue.offer(70);
		queue.offerFirst(20);
		queue.offerLast(30);
		queue.offer(40);
		System.out.println(queue);
		
		//System.out.println(queue.poll());
		System.out.println(queue.pollFirst());	
		//System.out.println(queue.pollLast());
		
		//System.out.println("poll:"+queue);
		
		//System.out.println(queue.peek());
		//System.out.println(queue.peekLast());
		System.out.println(queue.peekFirst ());		
	}
}
