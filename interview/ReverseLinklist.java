//	11>Revese a Linked List

import java.util.*;
class ReverseLinklist
 {
	public static void main(String[] args)
	{
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(14);
		ll.add(12);
		ll.add(78);
		ll.add(45);
		ll.add(74);
		
		System.out.println("linklist are:-"+ll);
		Collections.reverse(ll);
		System.out.println("After Reverse LinkedList are:-"+ll);
		
	}
 }
 