//Adding the each book in the directory(or possible author)
package Project1;

import java.util.*;


public class SortingFilings {
	public static void main (String args[]) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Ender's Game");
		queue.add("Alice in Wonderland");
		queue.add("Dracula");
		queue.add("The Martian");
		queue.add("1984");
		
		
		System.out.println("Priority queue elements" + queue);
		
		System.out.println("head using element:"+queue.element());  
		System.out.println("head using peek:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}
}
		
		
	


