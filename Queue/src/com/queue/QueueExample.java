package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {


		Queue<String>  queue  = new LinkedList<String>();
		
			System.out.println("Is Empty "+queue.isEmpty());
		
				queue.add("Delhi");
				queue.add("Mumbai");
				queue.add("Hyderabad");
				queue.add("Kolkatta");
				queue.add("Chennai");
				
				System.out.println("List of Cities");
				System.out.println(queue);
				System.out.println(queue.size());
				
			String removed =	queue.remove();
					
				System.out.println(removed);
				
				System.out.println(queue.size());
				
				
				
				System.out.println("Is Empty "+queue.isEmpty());
				
				
				
	}

}
