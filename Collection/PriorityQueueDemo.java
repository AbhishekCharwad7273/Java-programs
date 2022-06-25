

import java.util.*;

public class PriorityQueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> queue=new PriorityQueue();//it will give min value priority fisrt
		//PriorityQueue<Integer> queue=new PriorityQueue(Comparator.reverseOrder());//it will give max value priority fisrt
		queue.offer(70);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		
		System.out.println(queue.poll());	
			
		System.out.println(queue);
		
		System.out.println(queue.peek());

		System.out.println(queue);		
	}
}
