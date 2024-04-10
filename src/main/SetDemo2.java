package main;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();//set is ordered alphabetically
		set.add("john");
		set.add("jennie");
		set.add("john");
		set.add("jim");
		set.add("jack");
		set.add("john");
		set.add("joe");
		set.add("becky");
		
		//1. data is unique, no redundancy
		//2. data is unordered in output due to hashing
		System.out.println("set is: "+set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
	}

}
