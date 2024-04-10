package main;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a set interface with reference to treeset
		Set<String> ts1 = new TreeSet<String>();
		//elements that are added using add() method
		ts1.add("a");
		ts1.add("b");
		ts1.add("c");
		//duplicates will not get insert
		ts1.add("c");
		//elements get sorted in default natural sorting order(ascending)
		System.out.println(ts1);
	}

}
