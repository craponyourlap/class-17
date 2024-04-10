package main;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
		set1.add(3);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(7);
		set2.add(8);
		set2.add(11);
		System.out.print("answer is: ");
		if(!set1.equals(set2)) {
			for (Integer i : set1) {
				if (!set2.contains(i)) {
					System.out.print(i+" ");
				}
			}
			for (Integer i : set2) {
				if (!set1.contains(i)) {
					System.out.print(i+" ");
				}
			}
		}
	}

}
