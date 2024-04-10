package main;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
			//string with smallest length gets processed first
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		pq.add("1234");
		pq.add("12345");
		pq.add("123");
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}
