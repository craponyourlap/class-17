package main;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add("a");
		linkedhashset.add("b");
		linkedhashset.add("c");
		linkedhashset.add("d");
		linkedhashset.add("e");
		String[] values = new String[linkedhashset.size()];
		linkedhashset.toArray(values);
		System.out.println(Arrays.toString(values));
	}

}
