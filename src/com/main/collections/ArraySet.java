package com.main.collections;

import java.util.HashSet;
import java.util.Iterator;

public class ArraySet{

	public static void main(String[] args) {
		HashSet<String>nameSet = new HashSet<>();
		nameSet.add("Kalpana");
		nameSet.add("Kelvish");
		nameSet.add("Dhan");
		System.out.println("name :" + nameSet);
		nameSet.remove("Kelvish");
		nameSet.add("Kalpana");
		nameSet.add(null);
		System.out.println("new list:" + nameSet);
        System.out.println("Is Empty :" + nameSet.isEmpty());
        System.out.println("Check for Kalpana :" + nameSet.contains("Kalpana"));
		Iterator it=nameSet.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
         
         
         
	}

}
