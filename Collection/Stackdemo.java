import java.util.Stack;
import java.util.Collections;
import java.util.*;

public class Stackdemo//last in last out Data structure
{
	public static void main(String args[])
	{
		Stack<String> animals=new Stack<>();
		animals.push("Cat");
		animals.push("Horse");
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Bear");
		System.out.println(animals);
		System.out.println(animals.peek());
		animals.pop(); 
		System.out.println(animals);
		
		System.out.println(animals.isEmpty());
		System.out.println(animals.size());
		Collections.sort(animals);
		System.out.println("Animal are arrange in asending order:="+animals);
		Collections.sort(animals,Comparator.reverseOrder());
		System.out.println("Desending order element are:="+animals);
		}
	
}