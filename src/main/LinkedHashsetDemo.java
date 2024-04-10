package main;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedset = new LinkedHashSet<>();
		//adding element to linkedhashset
		linkedset.add("maruti");
		linkedset.add("bmw");
		linkedset.add("honda");
		linkedset.add("maruti"); //this will not add new element as maruti already exists
		linkedset.add("walkswagon");
		System.out.println("size of linkedhashset= "+linkedset.size());
		System.out.println("original linkedhashset= "+linkedset);
		System.out.println("removing audi from linkedhashset= "+linkedset.remove("audi"));
		System.out.println("trying to remove z which is not preset= "+linkedset.remove("z"));
		System.out.println("checking if maruti is present= "+linkedset.contains("maruti"));
		System.out.println("updated linkedhashset= "+linkedset);
	}

}
