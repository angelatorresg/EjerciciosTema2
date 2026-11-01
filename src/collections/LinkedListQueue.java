package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		
		Queue<String> tickets = new LinkedList<>();
		tickets.offer("Ticket 1");
		tickets.offer("Ticket 2");
		tickets.offer("Ticket 3");
		
		while(!tickets.isEmpty()) {
			System.out.println("Entrega: " + tickets.poll());
		}
	}

}
