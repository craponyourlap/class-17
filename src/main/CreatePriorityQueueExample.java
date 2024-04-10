package main;

import java.util.PriorityQueue;

public class CreatePriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		//add items to a priority queue (enqueue)
		numbers.add(750);
		numbers.add(500);
		numbers.add(900);
		numbers.add(100);
		//remove items from the priority queue (dequeue)
		while(!numbers.isEmpty()) {
			System.out.println(numbers.remove());
		}
	}

}
