

import java.util.*;

public class QueueDemo//last in first out concept
{
	public static void main(String args[])
	{
		Queue<Integer> queue=new LinkedList();//because linklist are implements queue
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		
			System.out.println(queue.poll());//it will delete first element	
				System.out.println(queue);
			System.out.println(queue.peek());	
	}
}
