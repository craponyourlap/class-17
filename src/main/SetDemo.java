package main;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		//here data is not added as in indexing approach.
		//we got hashcodes for elements which are being added
		set.add("john");
		set.add("jennie");
		set.add("john");
		set.add("jim");
		set.add("jack");
		set.add("john");
		set.add("joe");
		
		//1. data is unique, no redundancy
		//2. data is unordered in output due to hashing
		System.out.println("set is: "+set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("jim");
		System.out.println("set after removing jim is: "+set);
		if(set.contains("john")) {
			System.out.println("john is in the set");
		}
		
		System.out.println("set size is: "+set.size());
		
	}

}
